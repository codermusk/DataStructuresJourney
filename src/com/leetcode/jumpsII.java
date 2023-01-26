package com.leetcode;
import com.Util.scanner ;

import java.util.Scanner;

public class jumpsII {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int a =  sc.nextInt();
        int arr[] = new int [a] ;
        for(int i = 0 ; i<a ; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0 , jumps = 0 , curr= 0 ;
        for(int i = 0  ; i<a ; i++){
            max = Math.max(max , i+arr[i]) ;
            if(i==curr){
                jumps++;
                curr = max;
            }


        }
        System.out.println(jumps);
    }
}
