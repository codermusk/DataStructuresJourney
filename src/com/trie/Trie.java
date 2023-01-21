package com.trie;

public class Trie {
    private static Node root;

    Trie() {
        root = new Node();
    }


    public void insert(String word) {
        Node node = root ;
        for(int i = 0 ; i<word.length() ; i++){
            if(!node.containsKey(word.charAt(i)))
                node.putNode(new Node() , word.charAt(i));

            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }


    public boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i)))
                return false;

            node = node.get(word.charAt(i));
        }

        if (node.isEnd()) {
            return true;
        } else {
            return false;
        }
    }


    public  boolean startsWith(String  prefix){
        Node node = root ;
        for(int i = 0 ; i<prefix.length() ; i++){
            if(!node.containsKey(prefix.charAt(i)))
                return  false ;
            node = node.get(prefix.charAt(i));

        }
        return  true  ;

    }


}
