package com.pattern;

import java.util.Scanner;

public class epattern {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt();
    for(int i = 0 ; i < n ; i++) {

        for (char c = (char) ('E'-i); c<='E' ; c++){
            System.out.print(c);

        }
        System.out.println();

    }
    }
}
