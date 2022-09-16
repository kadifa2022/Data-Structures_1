package com.Cydeo;

import java.util.ArrayList;

public class SinglyLinkedListApp {//check this one

    public static void main(String[] args) {
        MySinglyLinkedList myList=new MySinglyLinkedList();


        for (int i = 0; i <10 ; i++) {
            myList.add(i);
        }
        myList.printNodes();
       // ArrayList<Integer> bList=new ArrayList<>();
        System.out.println("kth item from last:" +myList.getKthItemFromLast(3));
        myList.deleteById(1);
        myList.printNodes();
        myList.removeKthItemFromLast(1);
       // System.out.println("index of 3 :" + myList.indexOf(3));
   }
}
