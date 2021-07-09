package com.leetCode.medium;

import java.util.*;
 import java.util.stream.Collectors;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MissingNumber {
    public void solution(int[] arr) {

        Set<Integer> mySet = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            mySet.add(arr[i]);
        }
        int n = mySet.size()+1;
        System.out.println("size"+n);
        int sum_n = (n) * (n + 1) / 2;

      Integer sum_numbers = 0;
     List<Integer> myList = mySet.stream().collect(Collectors.toList());
     for(Integer sum_numb:myList) 
         sum_numbers+= sum_numb;
     Integer missing_Number = -sum_numbers+sum_n;

        System.out.println(missing_Number);
    }


    public int smallestMissingNumber(int[] numbers){
       HashSet<Integer> myHashSet = new HashSet<>();

       for(int i=0;i<numbers.length;i++)
            myHashSet.add(numbers[i]);

        System.out.println("sorted numbers "+myHashSet);

       int missingElement = 1;

        Iterator<Integer> myIterator = myHashSet.iterator();
            while(myIterator.hasNext())
            if(myIterator.next() == missingElement) {
                missingElement++;
            }/*else{
                myHashSet.add(missingElement);
                break;
            }*/
        System.out.println(missingElement);
            return missingElement;

        //System.out.println("Final elements "+myHashSet);



    }
        public static void main(String a[]){
        MissingNumber number  = new MissingNumber();
         number.smallestMissingNumber(new int[]{1,3,6,4,1,2});
            number.smallestMissingNumber(new int[]{-1,-3});


        }
    }
