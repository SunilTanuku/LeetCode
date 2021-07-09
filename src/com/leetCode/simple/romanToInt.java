package com.leetCode.simple;

import java.util.*;

public class romanToInt{

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        Integer s1 = 0;
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if(i>0 && (romanValues.get(s.charAt(i))>romanValues.get(s.charAt(i-1)))){
                s1 +=romanValues.get(s.charAt(i))-2*(romanValues.get(s.charAt(i-1)));

            }else
            s1 += romanValues.get(s.charAt(i));

        }
        System.out.println(s1);
        return s1;

    }
    public static void main(String a[]){
        romanToInt t = new romanToInt();
        t.romanToInt("DVI");
    }
}