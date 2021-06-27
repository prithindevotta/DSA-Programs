package cp;

import java.util.LinkedList;
import java.util.Scanner;

public class HeightOfTree {
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

    static int height(Node node)
    {
        int count = 0;
        LinkedList<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        while (!q.isEmpty()){
            Node curr = q.poll();
            if (curr == null && !q.isEmpty()){
                count++;
                q.add(null);
            }
            else if(curr != null){
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return count+1;
    }

    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node head = BinaryTree();
        System.out.println(height(head));
    }
}
