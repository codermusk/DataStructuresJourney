package com.pattern;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = a;
        int l = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (k == j) {
                    System.out.print(j);


                } else if (j == l) {
                    System.out.print(j);


                } else
                    System.out.print(" ");


            }
            l++;
            k--;
            System.out.println(" ");


        }
    }
}
