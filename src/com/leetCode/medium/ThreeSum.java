package com.leetCode.medium;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
           List<List<Integer>> myList = new ArrayList<>();
           for(int i = 0;i<nums.length;i++){
               for(int j=i+1;j<nums.length;j++){
                   for(int k = j+1;k<nums.length;k++){
                       if(nums[i]+nums[j]+nums[k] == 0){
                          if(!myList.contains(Arrays.asList(nums[i],nums[j],nums[k]))) {
                               myList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                          }
                       }
                   }
               }
           }
            return myList;
    }
    public static void main(String a[]){
        ThreeSum t = new ThreeSum();
       List p = t.threeSum(new int[]{-1,0,1,2,-1,-4});

    }

}
