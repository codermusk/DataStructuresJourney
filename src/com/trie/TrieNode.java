package com.trie;

public class TrieNode {

    TrieNode Links[] = new TrieNode[26] ;
    int cntEnd = 0 ;
    int cntPre = 0 ;

    public  TrieNode(){

    }

    public boolean cotainsKey(char ch ){
        return Links[ch-'a']!=null;
    }

    public TrieNode get(char ch){
        return  Links[ch-'a'];


    }

    public  void put(char ch ,TrieNode node){
        Links[ch-'a']  =  node ;
    }

    void increaseEnd()
    {
        cntEnd++;
    }

    void increasePrefix() {cntPre++;}

    void deleteEnd(){
        cntEnd--;
    }

    void reducePrefix(){
        cntPre--;
    }

int getend(){
        return  cntEnd;
}

int getpre(){
        return  cntPre;
}

}
