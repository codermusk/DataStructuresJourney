package practice;

import java.util.Scanner;
import java.util.Stack;

public class string {
    public static void main(String[] args) {
        String ans1 = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> st =new Stack<>();
        for(int i = 0 ; i<a.length() ; i++){
            if(a.charAt(i)!=']') st.push(a.charAt(i));
            else {
                String ans = "" ;
                while (st.peek()!='['){
                    ans = st.pop()+ans ;
                }
                st.pop() ;
                String number = "" ;
                while (!st.isEmpty() && Character.isDigit(st.peek()))
                {
                    number = st.pop()+number ;
                }
                int n = Integer.parseInt(number) ;
                while (n-->0){
                    for(int j = 0 ;j < ans.length() ; j++)
                        st.push(ans.charAt(j));

                }
            }
        }
        while (!st.isEmpty()){
          ans1 = st.pop()+ans1 ;
        }
        System.out.println(ans1);
    }
}
