package practice;

public class medianofTwoSortedarrays {
    public static  double findmedian(int arr[] , int arr1[])
    {
        int n1= arr.length ;
        int n2 = arr1.length ;
        if(n2>n1) return  findmedian(arr1 , arr);
        int lo = 0 ;
        int hi = 2*n2 ;
        while (lo<=hi){
            int mid2 =  (lo+hi)/2;
            int mid1 = n2+n1-mid2;
            double l1 = (mid1==0)? Integer.MIN_VALUE : arr[mid1-1/2];
            double l2 = (mid2==0)?Integer.MAX_VALUE:arr[mid2-1/2];
            double r1 =(mid1==0) ? Integer.MAX_VALUE : arr[mid1/2];
            double r2 = (mid2==0)?Integer.MAX_VALUE : arr[mid2/2];
            if(l1>r2 ) lo = mid2+1 ;
            if(l2>r1) hi = mid2-1;
            else return (Math.min(r1,r2)+Math.max(l1,l2))/2;

        }
        return  -1 ;
    }
}
