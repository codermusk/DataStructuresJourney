package practice;

import java.util.Scanner;

public class LongPalSubseq  {
    static Scanner sc = new Scanner(System.in);
    public  static int   palsub(String a , String b){
        int dp[][] = new int[a.length()+1][b.length()+1];
        for(int i =0 ; i <a.length() ; i++){
            for(int j = 0; j<b.length();j++){
                dp[i+1][j+1] = a.charAt(i) == b.charAt(j) ? 1 + dp[i][j] : Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        return  dp[a.length()][b.length()];


    }

    public static void main(String[] args) {
        String a  = sc.next();
        String b = sc.next();
        System.out.println(palsub(a,b));
    }


}
