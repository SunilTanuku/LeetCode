package com.leetCode.simple;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicatesFromSortedArray(int[] nums){
       int i=0;
       int[] temp = new int[nums.length];
        //System.out.println("--- "+nums[9]);
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j+1] != nums[j]) {

                    temp[i] = nums[j];    // u r comparing the n and n+1 element and adding n element to the array
                                          // when it comes to last element there is nothing to add so we need to add manially
                                            // even if the last element exists and if it has duplicats then condtn not satisfied
                                            // SO  we need to add manually
                    i++;
                }

            }

           // System.out.println("final nums "+nums[k]);
        for(int k=0;k<i;k++){
            System.out.println("nums  "+nums[k]);
        }

        return i+1;
    }
    public int implementAsList(int[] nums){

        Set mySet = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!mySet.contains(nums[i]))
                mySet.add(nums[i]);
        }
        System.out.println(mySet);
         return mySet.size();
    }
    public static void main(String a[]){
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int size =r.removeDuplicatesFromSortedArray(new int[]{1,2,2,3,3,4,4,5,5,5});
       // int size2 =r.implementAsList(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(size);
       // System.out.println(size2);
    }
}
