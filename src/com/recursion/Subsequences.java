package com.recursion;

import java.util.ArrayList;

public class Subsequences {
    public static  void Subeq(int index , ArrayList<Integer> ls , int size , int[] arr) {
        if(index==size){
            for(int i : ls){
                System.out.print(i+" ");
            }
            if(ls.size()==0)
                System.out.print("{}");
                System.out.println();
            return;
        }

        Subeq(index+1 , ls, size  , arr);
        ls.add(arr[index] );
        Subeq(index+1 , ls, size , arr);
        ls.remove(ls.size()-1);







    }
    public static void main(String[] args) {
         int size =3 ;
         int arr[] = {3,1,2};
         ArrayList<Integer> ans = new ArrayList<>();
         Subeq(0,ans,size , arr);
    }
}
