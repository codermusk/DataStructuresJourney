package practice;


import java.util.Scanner;

public class lcs {
    public static int Longestcs(String a , String b ){
        int dp[][] = new int[a.length()+1][b.length()+1];
        for(int i =0 ; i <a.length() ; i++){
            for(int j = 0; j<b.length();j++){
                dp[i+1][j+1] = a.charAt(i) == b.charAt(j) ? 1 + dp[i][j] : Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        return  dp[a.length()][b.length()];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
       String rev = new StringBuffer(a).reverse().toString();
        System.out.println( Longestcs(a,rev));

    }

}
