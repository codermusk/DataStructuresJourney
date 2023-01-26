package com.leetcode;

import java.util.Scanner;

public class ZigZagCon {
    public static String conversion(String a, int rows) {

        StringBuilder[] sb = new StringBuilder[rows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int row = 0, dir = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            row += dir;
            sb[row].append(c);
            if (row == 0 || row == rows - 1)
                dir = (dir == 0) ? 1 : -dir;

        }
        return append(sb);
    }

    public static String append(StringBuilder[] stringBuilders) {
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : stringBuilders) {
            ans.append(sb);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create string builders of number of rows and keep an int for direction and add the character accordingly to the roes and append the string builders  together and rrreturn the ans
        String a = sc.next();
        int numRows = sc.nextInt();
        System.out.println(conversion(a,
                numRows));
    }
}
