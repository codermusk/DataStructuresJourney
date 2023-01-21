package practice;

public class primeOrNotRecursion {
    public static boolean isPrime(int number , int i){
        if(number<=2){
            return number == 2;
        }
       if(number%i==0)
            return  false ;
     if(i*i>number)
         return  true;
     return isPrime(number,i+1);



    }

    public static void main(String[] args) {
        int n = 12 ;
        if(isPrime(n,2))
        System.out.println("prime");
        else
        System.out.println("false");
    }
}
