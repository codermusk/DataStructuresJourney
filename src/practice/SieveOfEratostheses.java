package practice;

public class SieveOfEratostheses {
    //to find the prime factors of the number 
    public static void main(String[] args) {
        int num = 500 ;
        boolean b[] = new boolean[num+1];
        int p = 1 , res=0;
        for(int i =2 ; i<=(int)Math.sqrt(num) ; i++){
            if(b[i]==false)
            {
                for(int j = i ; j<=num ; j+=i){
                    b[j] = true;

                }
                p*=i;
                if(p<num)
                    res++;
                else
                    break;

            }
        }
        System.out.println(res);
    }
}
