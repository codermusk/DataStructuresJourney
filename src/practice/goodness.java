package practice;

public class goodness {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1 ,1 ,0 ,0, 1, 1, 0, 0, 0, 1, 0, 0};
        int max = Integer.MIN_VALUE;
        int len = 0 ;
        for(int i = 0 ;i<arr.length ; i++){
            int zerocnt = 0 ;
            int onecnt = 0 ;
            for(int j = i ; j <arr.length ; j++){
                if(arr[j]==1) onecnt++;
                else  zerocnt++;
                int diff = onecnt-zerocnt;
                if(diff>max){
                    max = diff;
                }
                if(diff == max){
                    if(len < j-i+1){
                        max = diff ;
                        len = j-i+1;
                    }
                }

            }
        }
        System.out.println(len);
    }
}
