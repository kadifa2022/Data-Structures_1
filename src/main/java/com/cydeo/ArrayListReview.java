package com.cydeo;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

// Add elements to ArrayList
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        // Iteration on ArrayLists
        // 1. For Loop with get(index)

        System.out.println("Printing with legacy for-loop..............");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // 2. Iterator
        // Forward Iteration
        System.out.println("Printing with iterator..............");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Backwards Iteration//with functional interface
        System.out.println("Printing Backwards with iterator..............");

        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        // 3. for each loop
        System.out.println("Printing with for_each loop..............");
        for (Student s : students) {
            System.out.println(s);
        }

        // 4. Lambda
        System.out.println("Printing with Lambda function loop..............");
        students.forEach(student -> System.out.println(student));


        // Sorting Elements in List using comparator interface

        System.out.println("Sorting elements id descending order by id");
        Collections.sort(students, new sortByIdDescendingOrder());
        students.forEach(student -> System.out.println(student));

    }
        //implementation of Comparator functional interface
        static class sortByIdDescendingOrder implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o2.id-o1.id;

        }



    }

}


