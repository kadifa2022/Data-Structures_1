package com.Cydeo.practice;


public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){

        return head==null;
    }
    public void removeKthItemFromLast(int k){
        //create 3 pointers

        Node ptr1=head;
        Node ptr2=head;
        Node prev=null;
        //move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }
        //move both pointers until prt2 hits the last element
        while(ptr2.next !=null){
            prev = ptr1;
            ptr1= ptr1.next;
            ptr2=ptr2.next;
        }
        //ptr1 is in the kth element from last
        //do delete operation
        if(ptr1==head){
            head=ptr1.next;
            ptr1.next=null;
            size--;
        }else if(ptr1==tail){
            tail=prev;
            prev.next= null;
            size--;
        } else{
            prev.next=ptr1.next;
            ptr1.next=null;
            size--;
        }
    }




}
