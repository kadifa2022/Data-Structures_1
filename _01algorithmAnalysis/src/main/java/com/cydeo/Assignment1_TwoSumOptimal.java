package com.cydeo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {



        public static void main(String[] args) {

            int[] array=new int[]{2,7,9,11};
            System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));

        }
        public static int[] twoSumOptimalSolution(int[] array, int targetValue){
            //complexity of the solution is on O (n) but I have space complexity O(n)
            //create hashMap
            Map<Integer, Integer> map= new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                int potentialMatch= targetValue-array[i];
                if(map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
                        else map.put(array[i],i);
                }

            return new int[]{};

            }


        }


