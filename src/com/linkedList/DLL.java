package com.linkedList;

public class DLL {
    private class Node{
       private int val ;
       private Node next ;
       private  Node prev ;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    Node head ;

    public  void insert(int number){
        Node node = new Node(number);


            node.next = head;
            node.prev = null;

           if(head!=null){
               head.prev = node;
           }
           head = node ;


        }
public Node find(int after){
        Node temp = head;
        while (temp!=null){
            if(temp.val==after){
                return temp ;
            }
            temp = temp.next;
        }
        return  null;
}


public void insert(int after , int value ){
        Node  p = find(after);
        if(p==null){
            System.out.println("Not Exist");
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node ;
        node.prev = p ;
        if(node.next!=null){
            node.next.prev = node;
        }
}
        public void display(){
        Node node = head ;
        Node last = null;
        while (node!=null){
            System.out.print(node.val +"->");
            last = node;
            node = node.next;
        }
            System.out.println("end");
            System.out.println("printing in Reverse");
        while (last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
            System.out.println("end");
        }

public void insertAtLast(int number){
        Node node  = new Node(number);
        Node temp = head ;
        if(head==null){
            head = node ;
            node.prev = null;
            return;
        }
        while (temp!=null){
            temp = temp.next;

        }
        temp.next= node ;
        node.prev = temp ;
        node.next = null;


}


}
