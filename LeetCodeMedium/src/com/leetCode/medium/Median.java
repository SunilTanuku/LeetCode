package com.leetCode.medium;

import java.util.Arrays;

public class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] median = new int[m+n];
        for(int i=0;i<m;i++){
            median[i] = nums1[i];
        }
        for(int j=0;j<n;j++){
            median[j+m] = nums2[j];
        }
        Arrays.sort(median);
        double value = 0;
 /*        for(int k = 0;k<median.length;k++){
             System.out.println(median[k]);
            value =  value+median[k];
         }
         value = value/(m+n);
        return value;*/

        Arrays.sort(median);
        int n1 = median.length;
        if (n1 % 2 != 0)
            return (double)median[n1 / 2];

        return (double)(median[(n1 - 1) / 2] + median[n1 / 2]) / 2.0;

    }
    public static void main(String are[]){
        Median t = new Median();
       double result =  t.findMedianSortedArrays(new int[]{1,3},new int[]{2,7});
       System.out.println(result);

    }
}
