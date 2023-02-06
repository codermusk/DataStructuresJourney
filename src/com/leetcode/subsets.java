package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class subsets {
    public static void backtractrack(int index, int arr[], List<List<Integer>> ls, List<Integer> ans) {
        if (index == arr.length) {
            ls.add(new LinkedList<>(ans));
        }
        ans.add(arr[index]);
        backtractrack(index + 1, arr, ls, ans);
        ans.remove(ans.size() - 1);
        backtractrack(index + 1, arr, ls, ans);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> ans = new LinkedList<>();
        backtractrack(0, arr, ans, new ArrayList<>());

    }
}
