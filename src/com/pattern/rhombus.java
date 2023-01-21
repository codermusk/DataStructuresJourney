package com.pattern;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0 ; i<2*num-1 ; i++){
            for(int j = 0 ; j<2*num-1 ; j++){
                int top = i ;
                int left =j ;
                int right =(2*num-1)-1-j;

                int bottom = (2*num-1)-1-i;
                System.out.print(num-Math.min(Math.min(top , bottom) , Math.min(left , right)));
            }
            System.out.println();
        }

    }
}
