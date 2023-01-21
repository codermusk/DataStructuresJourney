package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class alternateSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        ArrayList<Integer> l = new ArrayList<>() ;
        for(String s : arr){
            int n = Integer.parseInt(s);
            l.add(n);


        }
        Collections.sort(l);
        int lef = 0 ;
        int rig =  l.size()-1 ;
        while (lef<rig){

            System.out.println(l.get(rig--));
            System.out.println(l.get(lef++));
        }
        if(l.size()%2==0)
            System.out.println(l.get(lef)); //edge case inorder to check whether middle element exists or notI


        Integer inte = 10 ;
        System.out.println(inte);


    }
}
