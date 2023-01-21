package com.pattern;

import java.util.Scanner;

public class eqTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }
            char a = 'A' ;
            int bp = (2*i+-1)/2 ;
            for(int j = 0 ; j<2*i+1 ; j++) {
                System.out.print(a);
                if(j<=bp) a++;
                else
                    a-- ;
            }

            for(int j = 0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
