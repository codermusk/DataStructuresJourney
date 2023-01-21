package com.contest;

import java.util.Arrays;
import java.util.Scanner;

public class platform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]  = new int [n];

        int dep[] = new int[n];

        Arrays.sort(arr) ;
        for (int i : arr) System.out.print(i+" ");
        for(int i : dep) System.out.print(i+" ");
        Arrays.sort(dep);
        int i = 0 , j =1 ;
        int result =1 ;
        int plat = 1 ;
        while(i<n && j<n){
            if(dep[i]>=arr[j]){
                plat++;
                j++;
            }
            else {
                plat -- ;
                i++;
            }
//            System.out.println(plat);
            result = Math.max(result , plat );
        }
        System.out.println(result);

    }
}
