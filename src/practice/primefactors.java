package practice;

import java.util.HashSet;
import java.util.Scanner;

public class primefactors {
    public static void main(String[] args) {
        int num =315 , num1 = 315;
        HashSet<Integer> set = new HashSet<>();
        while(num%2==0){
            num/=2;
            set.add(2);
        }
        for(int i = 3 ; i<=(int)Math.sqrt(num) ; i++){
            while (num%i==0)
            {
                set.add(i) ;
                num/=i;
            }

        }
        if(num!=1)
            set.add(num);

        System.out.println(set.size());
//        for(Integer i : set)
//            System.out.println(i);

HashSet<Integer> set1 = new HashSet<>();
        for(int i = 2 ; i<=num1;i++){
            while (num1%i==0)

            {
                set1.add(i);
                num1/=i;
            }

        }
        System.out.println(set1.size());
    }
}
