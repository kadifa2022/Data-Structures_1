package com.cydeo;

import java.util.Arrays;

public class AnotherOptimal {

    public static void main(String[] args) {
        int []nums ={2,7,9,15,16};
                int target= 24;
        int[]ind = new int [2];

        //sort methode here

        for (int i = 0, j =1; i< nums.length; i++, j++) {
            if(nums[i]>target){continue;}
            if(target -nums[i]==nums[j]){
                ind[0]=i; ind[1]=j;
                System.out.println(Arrays.toString(ind));
            }

        }






    }
}
