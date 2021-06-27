package cp;

import java.util.Scanner;
import java.util.Stack;

public class LinkedListInGroups {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static Node recurs(Node head){
        if (head ==null || head.next==null){
            return head;
        }

        Node rest = recurs(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    public static Node reverse(Node node, int k)
    {
        Node prev = null;
        Node curr = node;
        while (curr != null){
            int count=0;
            Stack<Node> stack = new Stack<>();
            while (curr!= null && count<k){
                stack.push(curr);
                curr = curr.next;
                count++;
            }
            while (stack.size()>0){
                if (prev==null){
                    prev = stack.peek();
                    node = prev;
                }
                else {
                    prev.next = stack.peek();
                    prev = prev.next;
                }
                stack.pop();
            }
        }
        prev.next = null;
        return node;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Node ques = new Node(scan.nextInt());
        Node head = ques;
        for (int i=1; i<5; i++){
            Node add = new Node(scan.nextInt());
            ques.next = add;
            ques = add;
        }
        Node head_res = reverse(head, 2);
        for (int i=0; i<5; i++){
            System.out.println(head_res.value);
            head_res = head_res.next;
        }
    }
}
