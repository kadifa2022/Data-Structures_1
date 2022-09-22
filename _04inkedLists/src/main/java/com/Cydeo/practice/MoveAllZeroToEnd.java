package com.Cydeo.practice;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        //with two pointer
        int[] arr = {1, 0, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveAllZeroToEnd(arr)));
    }


    public static int[] moveAllZeroToEnd(int[]array){
        int fast=0;
        int slow=0;
        while(fast <array.length-1){
            if(array[slow] !=0){
                slow++;
            }
            if (fast <= slow || array[fast] ==0) {
                fast ++;
            }
            if (array[slow]==0 && array[fast]!=0){
                array[slow]=array[fast];
                array[fast]=0;
            }
        }
        return array;

    }




}
