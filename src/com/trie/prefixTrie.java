package com.trie;

public class prefixTrie {

    private TrieNode root;

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.cotainsKey(word.charAt(i))) {
                node.put(word.charAt(i), new TrieNode());

            }
            node = node.get(word.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }

    public int countWordsEquals(String word) {
//        TrieNode node = root ;
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.cotainsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));

            } else {
                return 0;
            }


        }

        return node.getend();

    }

    public int countWordsEqualspre(String word) {
//        TrieNode node = root ;
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.cotainsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));

            } else {
                return 0;
            }


        }

        return node.getpre();

    }

    public void erase(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.cotainsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));
                node.reducePrefix();

            } else {
                return;
            }

        }
        node.deleteEnd();
    }
}