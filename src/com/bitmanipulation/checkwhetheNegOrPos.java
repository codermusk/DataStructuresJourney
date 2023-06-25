package com.bitmanipulation;

import java.util.Scanner;

public class checkwhetheNegOrPos {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in) ;
        a = sc.nextInt();
        if(a>>15==-1){
            System.out.println("-ve");
        }else{
            System.out.println("+ve");
        }
    }
}
