package com.Cydeo.practice;

import java.util.Locale;

public class IsPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String word){
        if(word.isEmpty() || word ==null){
            return false;
        }
        word = word.replace(" ", "").toLowerCase();
        int left =0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left) ==word.charAt(right)){
                right--;
                left++;
            }else{
                return false;
            }
        }
        return true;
    }


}
