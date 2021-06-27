package cp;

import java.util.*;

public class LevelOrderTraversal {
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
    static ArrayList<Integer> levelOrder(Node node)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Node> q = new LinkedList<>();
        if(node == null){
            return arr;
        }
        q.add(node);
        while (!q.isEmpty()){
            Node curr = q.poll();
            if (curr != null){
                arr.add(curr.data);
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node root = BinaryTree();
        ArrayList<Integer> res = levelOrder(root);
        for (int i: res){
            System.out.print(i+" ");
        }
    }
}
