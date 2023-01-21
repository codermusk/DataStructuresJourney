package com.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    private class Node {
        private int number;
        private Node next;

        public Node(int number) {
            this.number = number;
        }

        public Node(int number, Node next) {
            this.number = number;
            this.next = next;
        }
    }

    public void insertFirst(int number) {
        Node node = new Node(number);
        node.next = head;
        head = node;
        if (tail == null) {

            tail = node;
        }


    }
    public void display(){
        Node temp = head ;
        while (temp!=null){
            System.out.println(temp.number);
            temp =temp.next;
        }
    }


    public void insertAtLast(int number){
        Node node = new Node(number);
        if(tail==null){
            insertFirst(number);
            return;
        }
        tail.next = node ;
        tail = node ;


    }
    public  void insert(int number , int pos){

        if(pos ==0){
            insertFirst(number);
            return;
        }
        Node temp = head ;
        for(int i = 0 ; i <pos-1 ; i++){
            temp = temp.next;

        }
        Node node = new Node(number);
        node.next = temp.next;
        temp.next = node ;

    }


}
