package com.Cydeo;

import java.util.ArrayList;

public class SinglyLinkedListApp {//check this one

    public static void main(String[] args) {
        MySinglyLinkedList mylist=new MySinglyLinkedList();


        for (int i = 0; i <10 ; i++) {
            mylist.add(i);
        }
        mylist.printNodes();
       // ArrayList<Integer> bList=new ArrayList<>();
        System.out.println("kth item from last:" + mylist.getKthItemFromLast(3));
        mylist.deleteById(1);
        mylist.printNodes();
        mylist.removeKthItemFromLast(1);
        System.out.println("index of 3 :" + mylist.indexOf(2));
   }
}
