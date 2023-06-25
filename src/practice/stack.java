package practice;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Stack<Integer> stk = new Stack<>();
        int size = sc.nextInt() ;
        for(int i = 0 ; i<size ; i++){
            stk.add(sc.nextInt());

        }
        while (!stk.isEmpty()){
            System.out.println(stk.pop()+" ") ; // pop function prints and removes the element where as peek just prints the elements....!!!!
        }
    }

}
