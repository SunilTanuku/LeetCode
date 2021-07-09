package com.leetCode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Sum {
   /* public int[] twoSum() {

        Scanner c = new Scanner(System.in);
        System.out.println("enter  size of array");
        int a = c.nextInt();
        int[] nums = new int[a];
        Scanner elements = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i = 0;i<nums.length;i++){
            nums[i] = elements.nextInt();
        }
        Scanner c2 = new Scanner(System.in);
        System.out.println("Enter target number");
        int target = c2.nextInt();
        for(int i=0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){

                if(nums[i]+nums[j] == target){
                    System.out.println("valid numbesrs are "+nums[i] +"+"+nums[j]);
                }
            }
        }

        return nums;
    }*/


    public int[] twoSum(int[] nums, int target) {
 /*       for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              //  if((i !=j )&& (nums[i]+nums[j] == target)){
                if((nums[i]+nums[j] == target)){
                    return new int[]{i ,j};
                }
            }
        }
        return new int[]{0,0};*/
// to return index
/*        HashMap m = new HashMap();
        int required = 0;
        for(int i=0;i<nums.length;i++){
            required = target-nums[i];
            if(m.containsKey(required)){
                return new int[]{i, (int) m.get(required)};
            }
            m.put(nums[i],i);
        }
        return new int[]{0,0};*/
//to return value
        HashMap m = new HashMap();
        int required =0;
        for(int i=0;i<nums.length;i++){
            required = target-nums[i];
            if(m.containsKey(required)){
                int p = (int)m.get(required);
                return new int[]{nums[i],nums[p]};
                }
                m.put(nums[i],i);

            }
        return new int[]{0,0};

        }


    public static void main(String a[]){
        Sum m = new Sum();
       int[] aq = m.twoSum(new int[]{2,3,4,5},8);
       System.out.println("["+aq[0]+","+aq[1]+"]");

      }

}