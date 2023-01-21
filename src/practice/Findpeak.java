package practice;

public class Findpeak {

    public static  int peakutil(int arr[] , int low , int high  ,int n){
        int mid = low+(high-low)/2;
        if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid]) ){
            return  mid;
        }
        else if(mid>0||arr[mid-1]>arr[mid]) {
            return peakutil(arr, low, (mid - 1), n);
        }
        else
            return peakutil(arr , mid+1 , high , n);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.println( peakutil(arr, 0, n - 1, n));

    }
}
