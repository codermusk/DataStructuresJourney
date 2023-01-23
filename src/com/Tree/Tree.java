package com.Tree;

//import javax.swing.tree.TreeNode;
import java.util.*;

public class Tree {
    public  static  void preorder(Node head){
        if(head==null)
            return; // root left right
        else
            System.out.println(head.val);
        preorder(head.left);
        preorder(head.right);
    }
public  static  void inorder(Node head ){
        if(head == null) // left root right
            return;
       inorder(head.left);
    System.out.println(head.val);
    inorder(head.right);

}

public static  List<List<Integer>> bfs(Node head) {
        Queue<Node> q =new LinkedList<>() ;
        List<List<Integer>> l = new LinkedList<>();
        q.offer(head);
        while (!q.isEmpty()){
            int size = q.size() ;
           List<Integer> ans = new LinkedList<>();
            for(int i = 0 ; i<size ; i++) {
                Node n = q.poll();

                if (n != null) {
                    q.offer(n.left);
                    q.offer(n.right);
                    ans.add(n.val);
                }
            }
           l.add(ans);

        }
        return l ;




}

public static Node insert(Node root , int key){
        if(root == null) return  new Node(key);
        if(root.val<key){
            root.right = insert(root.right , key);

        }
        else {
            root.left = insert(root.left , key);
        }
        return  root  ;
}

public static  List<List<Integer>> Levelorder(Node root){
        List<List<Integer>>ans = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null ) return  ans ;
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> ls = new LinkedList<>();
            int size = q.size() ;
            for(int i = 0 ; i<size ; i++){
                if(q.peek().left!=null ) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                 ls.add(q.poll().val);

            }
            ans.add(ls);
        }
        return  ans ;
}
public static  List<Integer> preorderIt(Node root){
        List<Integer>ans = new LinkedList<>();
    Stack<Node> st = new Stack<>();
    st.push(root);
    while (!st.isEmpty()){
        root = st.pop() ;
        ans.add(root.val);

        if(root.right!=null) st.push(root.right);
        if(root.left!=null) st.push(root.left);


    }
    return  ans ;
}
    public static  List<Integer> inorderIt(Node root){
        List<Integer> list = new LinkedList<>();
        Stack<Node> stk = new Stack<>();
        Node node = root ;
        while (true){
            if(node!=null){
                stk.push(node) ;
                node = node.left ;
            }
            else{
                if(stk.isEmpty()){
                  break;
                }
                node = stk.pop();
                list.add(node.val) ;
                node = node.right ;

            }
        }
return  list ;
    }

    public  static List<Integer> postOrderit(Node root){
        Stack<Node> stk = new Stack<>();
        Stack<Node> stk2 = new Stack<>();
        List<Integer> ans = new LinkedList<>();
        stk.push(root);
        if(root==null)return ans;
        while (!stk.isEmpty()){
            root = stk.pop();
            stk2.add(root);
            if(root.left!=null) stk.add(root.left);
            if(root.right!=null) stk.add(root.right);

        }
while (!stk2.isEmpty()){
    ans.add(stk2.pop().val);
}
return  ans ;
    }



public static  void  postorder(Node head){ //left right root
        if(head == null)
            return;
        postorder(head.left);
        postorder(head.right);
    System.out.println(head.val);
}

public static  List<Integer>postOrderOneStack(Node head){

    Node curr = head ;
    Stack<Node> stk  = new Stack<>();
    List<Integer> ans = new LinkedList<>();
    while (curr!=null || !stk.isEmpty()){
        if(curr!=null){
            stk.push(curr);
            curr = curr.left;
        }else{
            Node temp =  stk.peek().right;
            if(temp==null){
                temp = stk.pop() ;
                ans.add(temp.val);
                while (!stk.isEmpty() && temp==stk.peek().right){
                    temp = stk.pop();
                    ans.add(temp.val);
                }
            }else{
                curr = temp ;
            }
        }

    }
    return  ans ;
}
    public static void main(String[] args) {
       Node root = new Node(20);
        Scanner sc = new Scanner(System.in) ;
       for(int  i = 0 ; i<6; i++){
           int val = sc.nextInt();
           insert(root , val);

       }
       List<List<Integer>> ls = bfs(root) ;
       for(int i = 0 ; i<ls.size() ; i++){
           for(int j : ls.get(i))
               System.out.print(j+" ");
           System.out.println();
       }




    }

}
