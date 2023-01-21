package practice;

import java.util.Scanner;



public class sod {

    public static  int sod(int number){

        int ans = 0 ;

        while (number!=0){
            ans+=number%10 ;
            number/=10 ;

        }
        if(ans>9){
            return sod(ans);
        }else
            return  ans ;

    }

    public static  int ret(int number){
        int ans = sod(number);
        if(ans>9){
           return  sod(ans);
        }else {
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt() ;
        int ans = sod(a);
        System.out.println(ans);

    }
}
