import javax.xml.bind.Element;
import java.util.*;

public class IntReverse {
    public int reverse(int x){
        long n,s = 0;
        while(x !=0) {
           n = x % 10;
            s = s*10+n ;
            x=x/10;
        }
        if(s<Integer.MIN_VALUE || s>Integer.MAX_VALUE)
            return 0;

    return (int) s;
    }
    public static void main(String a[]){
        IntReverse r = new IntReverse();
        int d = r.reverse(1534236469);
     //  boolean value =  r.intPalindrome(-121);
        Integer intValue = r.romanToInt("LCD");
        System.out.println(intValue);
     //  System.out.println(value);
       System.out.println("Reverse is "+d);
    }

    public boolean intPalindrome(int x){
        long n,s = 0;
        int p = x;
        while(x !=0 && x>0) {
            n = x % 10;
            s = s*10+n ;
            x=x/10;
        }
        if(s == p){
            return true;
        }else
            return false;
    }
    public int romanToInt(String s){
        HashMap<String, Integer> romanValues = new HashMap<>();
        Integer s1 =0;
        romanValues.put("I",1);
        romanValues.put("V",5);
        romanValues.put("X",10);
        romanValues.put("L",50);
        romanValues.put("C",100);
        romanValues.put("D",500);
        romanValues.put("M",1000);
        Integer finalValue = 0;
        Set mySet =  romanValues.entrySet();
        for(int i=0;i<s.length();i++){
            Iterator myIterator = mySet.iterator();
            while(myIterator.hasNext()){
                Map.Entry<String , Integer> mp  = (Map.Entry<String, Integer>) myIterator.next();
                if(mp.getKey().contains(String.valueOf(s.charAt(i)))){
                    finalValue+= mp.getValue();
                }
            }
        }
        return finalValue;
    }

}
