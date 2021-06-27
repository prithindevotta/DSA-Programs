package cp;

import java.sql.Statement;

public class ReverseALinkedList {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    static Node reverseList(Node head)
    {
        if(head==null){
            return null;
        }
        Node prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args){
        Node ques = new Node(1);
        Node head = ques;
        for (int i=2; i<7; i++){
            Node add = new Node(i);
            ques.next = add;
            ques = add;
        }
        Node res = reverseList(head);
        Node head_res = res;
        for (int i=0; i<6; i++){
            System.out.println(head_res.value);
            head_res = head_res.next;
        }
    }
}
