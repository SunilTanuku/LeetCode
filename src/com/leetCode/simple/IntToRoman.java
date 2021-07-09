package com.leetCode.simple;

public class IntToRoman {
    public String intToRoman(int numbers) {
        String[] units = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = new String[]{"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M"};
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        return thousands[(numbers/1000)]+
                hundreds[(numbers%1000)/100]+
                tens[(numbers%100)/10]+
                units[numbers%10];

    }
    public static void main(String a[]){
        IntToRoman r = new IntToRoman();
        System.out.println(r.intToRoman(506));
    }
}
