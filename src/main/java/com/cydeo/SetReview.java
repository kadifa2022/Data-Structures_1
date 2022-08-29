package com.cydeo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {


        //1. create a set
        Set<Student> set = new LinkedHashSet<>();
        set.add(new Student(10, "Mika"));
        set.add(new Student(20,"Tina"));
        set.add(new Student(30, "Diana"));
        set.add(new Student(40, "Dino"));
        System.out.println(set);


        String str= "Java Developer";
        System.out.println(firstRepeatingChar(str));
        // 2 add element


    }

    public static Character firstRepeatingChar(String str){
        //What is the time complexity of the following code? O(n)

        //create a hashSet
        Set<Character>chars= new HashSet<>();//in here I have Space Complexity of O(n)

        //iterate over the char array and add chars into hashSet
        for(Character ch: str.toCharArray()) if (!chars.add(ch)) return ch;
        //if add ops is false return that char

        return null;
    }
}



