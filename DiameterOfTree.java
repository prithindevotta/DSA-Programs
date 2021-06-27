package cp;
import java.util.Scanner;

public class DiameterOfTree {
    static Scanner scan;
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }

    static Node BinaryTree(){
        Node root;
        int data = scan.nextInt();
        if (data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left of " + data);
        root.left = BinaryTree();
        System.out.println("Enter the right of " + data);
        root.right = BinaryTree();

        return root;
    }
    static int res = Integer.MIN_VALUE;

    static int DiameterRec(Node root){
        if(root == null){
            return 0;
        }
        int l = DiameterRec(root.left);
        int r = DiameterRec(root.right);
        int temp = 1+Math.max(l,r);
        res = Math.max(res, l+r+1);
        return temp;
    }

    static int Diameter(Node node){
        DiameterRec(node);
        return res;
    }

    public static void main(String[] args){
        scan = new Scanner(System.in);
        Node head = BinaryTree();
        System.out.println(Diameter(head));
    }
}
