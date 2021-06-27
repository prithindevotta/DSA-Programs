package cp;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseLevelOrder {
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



    static public ArrayList<Integer> reverseLevelOrder(Node node)
    {
        LinkedList<Node> q = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> arr= new ArrayList<>();
        q.push(node);
        stack.push(node);
        while (!q.isEmpty()){
            Node curr = q.poll();
            if(curr.right != null){
                q.add(curr.right);
                stack.push(curr.right);
            }
            if (curr.left != null){
                q.add(curr.left);
                stack.push(curr.left);
            }
        }
        while (!stack.isEmpty()){
            arr.add(stack.pop().data);
        }
        return arr;
    }

    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node head = BinaryTree();
        ArrayList<Integer> arr =  reverseLevelOrder(head);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
