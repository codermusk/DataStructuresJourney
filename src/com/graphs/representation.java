package com.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class representation {


    public ArrayList<Integer> bfs(ArrayList<ArrayList>adj , int v){
        boolean vis[] = new boolean[v];
        ArrayList<Integer>arr  = new ArrayList<>() ;
        vis[0] = true ;

        Queue<Integer> q = new LinkedList<>();
        q.add(0) ;
        while (!q.isEmpty()){
            int Node = q.poll() ;
            arr.add(Node);
            for( Object i : adj.get(Node))
            {
                if(vis[(int) i]!=false){
                    vis[(int)i] = true ;
                    q.add((Integer) i) ;
                }
            }

        }
        return  arr;
    }
    public static void main(String[] args) {
        int u = 0, v = 0; 
        int size = 10 ;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i<=size ; i++){
            adj.add(new ArrayList<>());
            adj.get(u).add(v);
        }
    }
}
