package cp;

import java.util.Scanner;

public class MirrorTree {
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

    static Node Mirror(Node root){
        if(root == null){
            return null;
        }
        Node temp = Mirror(root.left);
        root.left = Mirror(root.right);
        root.right = temp;

        return root;
    }
    static Node Inorder(Node root){
        if (root == null){
            return null;
        }
        Inorder(root.left);
        System.out.print(root.data);
        System.out.print(" ");
        Inorder(root.right);

        return root;
    }


    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node head = BinaryTree();
        Inorder(head);
        System.out.println();
        Node rev = Mirror(head);
        Inorder(rev);
    }
}
