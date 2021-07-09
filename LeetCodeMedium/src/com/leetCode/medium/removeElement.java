package com.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeElement {
    public int removeElement(int[] nums ,int val){

        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!(nums[i] == val)){
                myList.add(nums[i]);
            }
        }
       System.out.println(myList);
        System.out.println(myList.size());
        return myList.size();

    }
public static void main(String arg[]){
        removeElement r = new removeElement();
        r.removeElement(new int[]{3,2,2,3},3);
}
}
