package com.leetCode.medium;

import java.util.*;
import java.util.stream.Collectors;

 public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){
        List<Integer> finalList = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           for(int j=1;j<nums.length;j++){
               if(nums[i] != nums[j]){
                   finalList.add(nums[i]);
               }
           }
       }
       System.out.println(finalList.size());
       System.out.println(finalList);
return finalList.size();
    }
    public static void main(String a[]){
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
     // int size =   r.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        int size =   r.removeDuplicates(new int[]{1,1,2});
     // System.out.println(size);
    }
}
