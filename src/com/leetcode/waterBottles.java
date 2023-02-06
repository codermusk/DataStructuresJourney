package com.leetcode;

import java.util.Scanner;

public class waterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottle = sc.nextInt();
        int exchange = sc.nextInt();
        int left = 0 , sum= 0 ;
        while (bottle>0){
            sum+=bottle ;
            left+=bottle ;
            bottle = left/exchange ;
            left%=exchange ;
        }
        System.out.println(sum);
    }
}
