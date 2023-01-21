package com.pattern;

import java.util.Scanner;

public class alphabetPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt() ;
        for(int i  = 0 ; i < n ; i++){
            for(char j = 'A' ; j<='A'+(n-i-1) ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
