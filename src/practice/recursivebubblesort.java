package practice;

import java.util.Scanner;

public class recursivebubblesort {
    public static void bsort(int arr[] , int n ){
        if(n==1)
            return;
        for(int i = 0 ; i<n-1 ; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp ;

            }
        }
        bsort(arr, n-1);
    }
    public  static  void  bbsort(int arr[] , int n ) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int [10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<10 ; i++){
            arr[i] = sc.nextInt();

        }
        bsort(arr , 10);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bbsort(arr , 10);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
