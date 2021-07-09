package com.leetCode.simple;

public class InsertPosition {
    public int searchInsert(int [] nums, int target){
       int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i] == target){
               return i;
           }else{
                if(nums[i]<target){
                    j++;
                }
           }
       }
           return j;
    }
    public static void main(String a[]){
        InsertPosition p = new InsertPosition();
        int value = p.searchInsert(new int[]{1,3,5,6},3);
        System.out.println(value);
    }
}
