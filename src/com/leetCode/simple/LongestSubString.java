package com.leetCode.simple;


import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int longestSubString(String a){
        String s = "sunil";

        Set<Character> mySet = new HashSet();
        int j = 0;
        for(int i=0;i<a.length();i++){
            if(!mySet.contains(a.charAt(i))){
                mySet.add(a.charAt(i));
                j++;
            }else{
                mySet.remove(a.charAt(i));
            }

        }
        System.out.println(mySet);
        return mySet.size();
    }

    public static void main(String[] args) {
        LongestSubString l = new LongestSubString();
       int required = l.longestSubString("pwwkew");
       System.out.println(required);

    }

}

