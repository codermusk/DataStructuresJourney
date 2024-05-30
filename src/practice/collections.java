package practice;

import java.util.*;

public class collections {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>() ;
        // syntax of a arraylist is this and a array list is same as as array but it is dynamic and not limited to any size

        int size = arr.size() ;  // this size() func returns the size of the arraylist

        arr.add(2) ; // add function adds the element  to the arraylist
        arr.get(0) ; // this method returns the element present at that particular index  eg : arr.get(index) this returns the elemnet in that index
        arr.contains(3) ; //this returns a boolean whether true or false eg : if 2 presents in arraylist it will return true else false

        arr.remove(0) ; //this func removes the value from that index
        arr.clear(); //clears the entire arraylist



        HashSet<Integer> s = new HashSet<>() ;
        // set will remove duplicates
        s.add(2) ;
        s.add(2) ;
        //omly one 2 will be added ;

        s.contains(3) ;
        // it will return true if 3 is present in the set
        s.isEmpty() ; //checks whether if the set is empty or not


        HashMap<Integer , Integer> map = new HashMap<> () ;
        // map consists of key value pairs

        map.put(2,2) ;// this func will create a table like this  key: 2  value :2

        map.get(2) ; //this will return a value present at key : 2
        for(Map.Entry<Integer, Integer>mp : map.entrySet()){
            System.out.println(mp.getKey()+ " " + mp.getValue());
        }








      }
}
