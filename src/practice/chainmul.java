package practice;

import java.util.Arrays;

public class chainmul {
    public static int dp[][] = new int[100][100];

    public static int matrixmulmemo(int arr[], int i, int j) {
        if (i == j) return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            dp[i][j] = Math.min(dp[i][j], matrixmulmemo(arr, i, k) + matrixmulmemo(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j]);
        }
        return dp[i][j];
    }

    public static int matrixmul(int arr[], int n) {
        int i = 1;
        int j = n - 1;
        return matrixmulmemo(arr, i, j);
    }

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(matrixmul(i,i.length));
    }
}
