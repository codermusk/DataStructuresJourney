package com.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSubseq {
    public static void printSubSequence(String s, int index, String subString) {
        if (index >= s.length()) {
            System.out.println(subString);
            return;
        }

        // not taking current character
        printSubSequence(s, index + 1, subString);
//        StringBuilder string = new StringBuilder(subString);
//        string.replace(subString.length()-1 , subString.length() , "");
//        subString= string.toString();

        // taking current character

//        subString += ;
        printSubSequence(s, index + 1, subString+s.charAt(index));





    }
public static  void AnotherMethod(int index , String a , String b){
        if(index==a.length()){
            System.out.println(b);
            return;
        }
        AnotherMethod(index+1 , a , b+a.charAt(index));
        AnotherMethod(index+1 , a , b);
}
    public static void main(String[] args) {
        printSubSequence("abc", 0, "");

//        AnotherMethod(0 , "abc" , "");
    }
}
