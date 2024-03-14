package com.contest;

public class maximumSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6} ;
        int sum = Integer.MIN_VALUE ;
        int val = 0 ;
        for(int i : arr) {
            val = Math.max(val+i , i) ;
            sum = Math.max(sum,val);
        }
        System.out.println(sum);
    }
}
