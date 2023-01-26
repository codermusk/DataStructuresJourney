package com.bitmanipulation;

public class greatestofTwoNumbers {
    public static void main(String[] args) {
        int a = -10 ;
        int b = 5 ;
        int d = a-b ;
        int c = d>>15 ;
        int ans = a+(c*(d));
        System.out.println(ans);
    }
}

