package com.leetcode;

import java.util.Scanner;

public class shuffleArray {
    public  static  int[] shuffle (int arr[] , int n){
        int ans[]  = new int[n+n];
        int i = 0 , j = n , k = 0 ;
        while(j<= arr.length-1){
            ans[k++] = arr[i++];
            ans[k++] = arr[j++];
        }
        return  ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = n/2 ;
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = shuffle(arr ,k) ;
    }
}
