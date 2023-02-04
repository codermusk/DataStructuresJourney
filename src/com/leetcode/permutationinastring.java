package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class permutationinastring {
    public static  boolean checkInclusion(String a , String b){
        int [] freq1= count(a);
        int [] freq2 = count(b.substring(0,a.length()-1)) ;
        int i = 0 , j =a.length()-1 ;
        while (j<b.length()){
            freq2[b.charAt(j)-'a']++ ;
            if(Arrays.equals(freq2 , freq1))
            return  true ;
            freq2[b.charAt(i)-'a']--;
            i++;
            j++;
        }

return  false ;
    }

    public  static  int[] count(String a){
        int freq[] = new int[26] ;
        for(char c : a.toCharArray())
            freq[c-'a']++;
    return  freq ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String a = sc.next() ;
        String b = sc.next();
        System.out.println(checkInclusion(a,b));

    }
}
