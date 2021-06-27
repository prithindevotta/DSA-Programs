package cp;

import java.util.Scanner;
import java.util.Stack;

public class PreorderTraversal {
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

    static Node preorderRecurr(Node root){
        if (root == null){
            return null;
        }
        System.out.print(root.data);
        System.out.print(" ");
        preorderRecurr(root.left);
        preorderRecurr(root.right);

        return root;
    }

    static void preorderItter(Node root){
        Stack<Node> stack = new Stack<>();

        Node curr = root;
        while (!stack.isEmpty() || curr!= null){
            if (curr != null){
                System.out.print(curr.data);
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                curr = curr.right;
            }
        }
    }


    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node head = BinaryTree();
        preorderItter(head);
    }
}
