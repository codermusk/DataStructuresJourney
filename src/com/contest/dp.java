package com.contest;

import java.util.Scanner;

public class dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int [a];
        for(int i = 0 ; i<a ; i++)
            arr[i] = sc.nextInt();

        int ans = Integer.MIN_VALUE;
        int premin = 0 ;
        int sum = 0 ;

        for(int val : arr){
            sum+=val;
            ans = Math.max(sum-premin , ans);
            premin =Math.min(premin , sum);
        }
        System.out.println(ans);
//        System.out.println(arr.length);
    }
}
