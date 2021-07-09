package com.leetCode.simple;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums,int val){
        System.out.println("length "+ nums.length);
        int[] myNums = new int[nums.length-1];
        int j = 0;
      for(int i=0;i<nums.length;i++){
          if(nums[i] != val) {
              myNums[j] = nums[i];
              j++;
          }

      }
      for(int k:myNums){
          System.out.println(k);
      }

        return j;
    }
    public static void main(String a[]){
        RemoveElement r = new RemoveElement();
      //  r.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        r.removeElement(new int[]{3,2,2,3}, 3);

    }
}
