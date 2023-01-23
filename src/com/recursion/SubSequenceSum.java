package com.recursion;

import java.util.ArrayList;

public class SubSequenceSum {
    public  static  void solve(int index , ArrayList<Integer>ans , int n , int sum , int val , int arr[]) {
        if (index == n) {
            if (sum == val) {
                for (int i : ans) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            return;
        }
        ans.add(arr[index] );
        sum+=arr[index];
        solve(index+1  , ans, n , sum , val , arr);
        ans.remove(ans.size()-1);
        sum-=arr[index];
        solve(index+1 , ans , n , sum , val , arr );



    }
    public static void main(String[] args) {
        int arr[] = {1,2,1} ;
        int size = 3 ;
        ArrayList<Integer> ls= new ArrayList<>();
        solve(0,ls,size,0,4, arr);

    }
}
