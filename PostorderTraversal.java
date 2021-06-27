package cp;

import java.util.Scanner;
import java.util.Stack;

public class PostorderTraversal {
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    static Scanner scan;
    static Node BinaryTree(){
        Node root;
        int data = scan.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("enter left of " + data);
        root.left = BinaryTree();
        System.out.println("enter right of " + data);
        root.right = BinaryTree();
        return root;
    }
    static Node PostorderRecurr(Node root){
        if (root == null){
            return null;
        }
        PostorderRecurr(root.left);
        PostorderRecurr(root.right);
        System.out.println(root.data);

        return root;
    }
    static void postorderIterr(Node root){
        Stack<Node> stack = new Stack<>();
        Stack<Node> out = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            out.add(curr);
            if (curr.left != null){
                stack.add(curr);
            }
            if (curr.right != null){
                stack.add(curr);
            }
        }
    }
    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node head = BinaryTree();
        PostorderRecurr(head);
    }
}
