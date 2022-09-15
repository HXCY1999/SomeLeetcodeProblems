package com.recursion;

import java.util.LinkedList;

public class RecursionTest {
    public static void main(String[] args) {
        test(3);
        System.out.println(intfactorial(4));



    }
    public static void test(int n){
        if (n>1){
            test(n-1);
        }
        System.out.println("n="+n);

    }
    public static int intfactorial(int n){
        if (n ==1 ){
            return 1;
        }else {
            return intfactorial(n-1)*n;
        }
        


    }
}
