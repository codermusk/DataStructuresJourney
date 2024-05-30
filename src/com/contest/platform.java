package com.contest;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class platform {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out) ;

        pw.println("Hello from print writer");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine() ;
        String someString = sc.next();

        System.out.println(someString);
        int arr[]  = new int [n];

        int dep[] = new int[n];

        int bal = arr.length ;

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
        System.out.println(result) ;

    }
}
