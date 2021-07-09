package com.leetCode.simple;

import org.omg.Messaging.SyncScopeHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DoubleSum {
    public int solution(int N) {
        int sum = 0, doubleSum = 0;

        sum = N % 10 + N / 10;
        System.out.println("sum value is " + sum);

        doubleSum = 2 * sum;
        System.out.println(sum + " " + doubleSum);
        int c = 0;
        // int i=0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++)
                if (i + j == doubleSum && i * 10 + j > N) {

                    System.out.println(i * 10 + j);
                    return i * 10 + j;
                    //  break;
                }

            return 0;

            // return new int[]{i,j};
        }
        return 8;
    }

    public static void main(String a[]){
        DoubleSum d = new DoubleSum();
        d.solution(10);
    }
}
