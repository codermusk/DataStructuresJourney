package practice;

public class SubsetSums {

    public static  void sumOfSubset(int arr[] , int l , int r ,int sum){
        if (l > r) {
            System.out.println(sum);
            return;
        }

        sumOfSubset(arr , l+1 , r , sum+arr[l]  );
        sumOfSubset(arr , l+1, r, sum);
    }
    public static void main(String[] args) {
        int arr [] = { 2, 3 };
        sumOfSubset(arr , 0 , arr.length-1 , 0);

    }
}
