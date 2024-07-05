package com.graphs;

import java.util.*;
class Pair{
    int node;
    int distance;
    public Pair(int distance,int node){
        this.node = node;
        this.distance = distance;
    }
}
public class DijikstraAlgorithm {
    public static void addIntoGraph(ArrayList<ArrayList<Pair>>adj, int node1, int node2, int weight){
        adj.get(node1).add(new Pair(node2,weight));
        adj.get(node2).add(new Pair(node1,weight));
    }

    public static int[] calculateShortestPath(ArrayList<ArrayList<Pair>>adj, int node, int size){
        int dist[] = new int[size];
        PriorityQueue<Pair> pq= new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
        for(int i = 0 ; i < size; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[node] = 0 ;
        pq.add(new Pair(node, 0));
        while (pq.size()!=0){
            int v = pq.peek().node;
            int weight = pq.peek().distance;
            pq.poll();
            for(int i = 0 ; i<adj.get(v).size(); i++){
                int edgeWeight = adj.get(v).get(i).distance;
                int adjNode = adj.get(v).get(i).node;
                if(weight+edgeWeight < dist[adjNode]){
                    dist[adjNode] = weight + edgeWeight ;
                    pq.add(new Pair(weight+edgeWeight, adjNode));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int size ;
        Scanner scanner  = new Scanner(System.in);
        size = scanner.nextInt();
        ArrayList<ArrayList<Pair>> mp = new ArrayList<>();
        for(int i = 0 ; i < size ; i++){
            mp.add(new ArrayList<>());
        }
        addIntoGraph(mp,1,2,10);
        addIntoGraph(mp,2,3,5);
        addIntoGraph(mp,3,4,6);
        int ans[] = calculateShortestPath(mp,1,size);
    }
}
