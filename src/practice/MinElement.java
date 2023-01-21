package practice;

import java.util.Scanner;

public class MinElement {
    public static  int minsorted(int arr[]){
        int left = 0 ;
        int right = arr.length-1 ;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]<arr[right])
                right = mid ;
            else
                left = mid+1;
        }
        return  arr[left];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        for(int i  = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println(minsorted(arr));


    }
}
