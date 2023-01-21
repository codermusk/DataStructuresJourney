package com.linkedList;

public class CircularLL {
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    Node head ;
    Node tail ;
     public  void  insert(int val ){
         Node node = new Node(val);
         if(head == null ){
             head = node ;
             tail = node  ;
             return;


         }
         tail.next= node ;
         node.next = head  ;
         tail = node ;


     }
     public  void display(){
         Node temp = head ;
         if(head!=null){
             do{
                 System.out.println(temp.val);
                 temp = temp.next;
             }while (temp!=head);
         }
     }

     public void delete(int val){
         Node node = head;
         if(node==null){
             return;
         }
         if(node.val==val){
             head = head.next ;
             tail.next = head;
         }
          do{
              Node temp = head ;
              if(temp.val==val){
                 node.next= temp.next ;
                break;
              }
              node = node.next;

          }while (node!=head );
     }

}
