package practice;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        Queue<Integer> q = new LinkedList<>() ;
        for(int i = 0 ; i<size ; i++) {
            q.add(sc.nextInt()) ;

        }
        while (!q.isEmpty()){
            System.out.println(q.poll()+" "); //poll prints and removes the element from the q where as peek just prints it print in the sense accessing the element
         }
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()) ; Inorder to sort the elements in desc

        for(int i = 0 ; i<size ; i++) {
            pq.add(sc.nextInt()) ;

        }
        // what priority queue does is sorts the elements in ascending order if we want to sort it in descending order we should use a comp function Collection.reverseOrder() like new PriorityQueue<>(Collections.reverseOrder())
        while (!pq.isEmpty()){
            System.out.println(pq.poll()+" "); //poll prints and removes the element from the q where as peek just prints it print in the sense accessing the element
        }

    }
}
