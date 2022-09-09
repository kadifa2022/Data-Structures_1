package com.cydeo;

import javax.net.ssl.ManagerFactoryParameters;
import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {

        //create hash map
        Map<Integer, String > studentsMap = new HashMap<>();
         studentsMap.put(1, "Jack");
         studentsMap.put(2, "Julia");
         String st="JJaaavDDevveloper";
        System.out.println(findFirstNonRepeating(st));


    }

    public static Character findFirstNonRepeating(String str) {

        //create a map: this will cost me space complexity O(n)
        Map<Character, Integer> map = new HashMap <>();
        int count;

        //counts the frequency of the chars
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                count= map.get(ch);
                map.put(ch, count+1);
            }
            else map.put(ch,1);
        }


        //starts from the beginning and check if there is char with frequency
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)){

            }
        }

        return null;
    }

}
