package cp;

import java.util.Scanner;
import java.util.Stack;

public class InorderTraversal {
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
    static Node InorderRecurr(Node root){
        if(root == null){
            return null;
        }
        InorderRecurr(root.left);
        System.out.print(root.data);
        System.out.print(" ");
        InorderRecurr(root.right);

        return root;
    }

    static void InorderIterr(Node root){
        if (root == null){
            System.out.println("-1");
        }

        Stack<Node> stack = new Stack();
        Node curr = root;
        while (!stack.isEmpty() || curr != null){
            if (curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            else{
                curr = stack.pop();
                System.out.print(curr.data);
                curr = curr.right;
            }
        }
    }

    public static void main(String[] args){

    }
}
