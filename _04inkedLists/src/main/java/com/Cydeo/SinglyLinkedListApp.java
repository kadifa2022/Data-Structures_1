package com.Cydeo;

import java.util.ArrayList;

public class SinglyLinkedListApp {

    public static void main(String[] args) {
        MySinglyLinkedList mylist=new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());

        for (int i = 0; i <10 ; i++) {
            mylist.add(i);
        }
        mylist.printNodes();
       // ArrayList<Integer> blist=new ArrayList<>();
        mylist.deleteById(1);
        mylist.printNodes();
        System.out.println("index of 3 :" + mylist.indexOf(3));
   }
}
