package com.pattern;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0 ; i<size ; i++){
            for(int j = 0 ; j <=i ; j++){

                    System.out.print("x"+" ");


            }
            System.out.println();
        }
    }
}
