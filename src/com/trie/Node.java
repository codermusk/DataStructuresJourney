package com.trie;

public class Node {

    Node Links []  = new Node[26];
    boolean flag = false ;

    public  Node(){

    }


    boolean containsKey(char ch){
        return  Links[ch-'a']!=null;
    }

Node get(char ch){
        return  Links[ch-'a'];

}

void putNode(Node node , char ch){
        Links[ch-'a'] = node ;
}

void setEnd(){
        flag = true ;
}

boolean isEnd(){
        return flag ;
}
}
