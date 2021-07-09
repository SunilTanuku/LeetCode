package com.leetCode.simple;

public class longestCommonPrefix {
  public String commonPrefix(String[] strs){
      String prefix = strs[0];
      System.out.println(strs.length);

      for(int i=1;i<strs.length;i++){
          while(strs[i].indexOf(prefix) !=0  ){
            prefix = prefix.substring(0,prefix.length()-1);
            System.out.println("prefix   " + prefix);
          }

        }
      return prefix;
      //  return "There is no common prefix among the input strings";
  }
  public static void main(String a[]){
      longestCommonPrefix s = new longestCommonPrefix();
      String output = s.commonPrefix(new String[]{"flower","flow","flight"});
      System.out.println(output);
  }

}
