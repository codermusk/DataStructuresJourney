package com.leetcode;

import java.util.Map;
import java.util.Scanner;

public class jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        int arr[] = new int[a] ;
        for(int i  = 0 ; i<a ;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true ;
        int reachable = 0 ;
        for(int i = 0 ; i<a ; i++){
            if(i>reachable) {
                flag = !flag;
                break;
            }
            reachable = Math.max(reachable , i+arr[i]);
        }
        System.out.println(flag);

    }
}
