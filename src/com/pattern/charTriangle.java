package com.pattern;

import java.util.Scanner;

public class charTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0  ; i<a; i++){
            char c = (char) ('A'+i);
            for(int j = 0 ; j<=i ; j++){
                System.out.print(c);
            }
            System.out.println();

        }
    }
}
