package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class findAllAnagram {

    public static List<Integer> Anagram(String one , String two){
        int a[] = new int[26] ;
        int b[] = new int[26] ;
        int len1= one.length() ;
        int len2 = two.length() ;
        for(char c : two.toCharArray())
            a[c-'a']++;
        for(int i = 0 ; i <len2-1 ; i++)
            b[one.charAt(i)-'a']++;

        List<Integer> ls= new LinkedList<>();
        if(len2>len1) return  ls;
        int k = 0;
        for(int i =len2-1; i<len1 ; i++ ){
            b[one.charAt(i)-'a']++;
            if(Arrays.equals(a,b)) ls.add(i-len2+1) ;
            b[one.charAt(k++)-'a']--;
        }
        return  ls;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String a = sc.next();
        String b = sc.next() ;
        List<Integer> ans = Anagram(a,b);
    }
}

//approach
//same as permutaions in a string
//sliding window approach
// count all the alphabets in string2 a
// and count all characters upto string2.length -1
//using sliding window method add one char and check whether arrays equals else remove  character