package practice;

public class MinMax {
    public static  void MinMax(int arr[] , int i , int j , int min , int max ){
        if(i==j){
//            if i==j then check min>arr[j] if min greater than arr[j] min = arr[j] max<arr[i] max = arr[i]
             if(min>arr[j])
                min = arr[j];
            if(max<arr[i])
                max = arr[i];
            return;
        }

        //if j-i==1 then arr[i]<arr[j] min> arr[i] min = arr[i] if max<arr[j] max = arr[j]
        //else min>arr[j] max<arr[i]
        if(j-i==1){
            if(arr[i]<arr[j])
            {
                if(min>arr[i])
                    min = arr[i];
                if(max<arr[j])
                    max = arr[j];

            }else{
                if(min>arr[j])
                    min=arr[j];
                 if(max<arr[i])
                     max= arr[i];
            }
            return;
        }
        int mid = (i+j)/2 ;
        MinMax(arr,i,mid,min,max);
        MinMax(arr,mid+1,j , min,max);

    }
    public static void main(String[] args) {
        int n = 9 ;
        int arr[] = new int[n] ;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

    }

}
