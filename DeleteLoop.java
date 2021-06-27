package cp;

import java.util.HashSet;

public class DeleteLoop {
    static class Node
    {
        int data;
        Node next;

        Node(int item)
        {
            data = item;
            next = null;
        }
    }
    static void removeNode(Node root){
        Node slow = root;
        Node fast = root;
        while (slow!=null && fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                remove_2(slow, root);
                break;
            }
        }

    }
    private static int remove_2(Node loop, Node root){
        Node po1 = loop;
        Node po2 = loop;
        if(po1 == root){
            while (po1.next != po2){
                po1 = po1.next;
            }
            po1.next = null;
            return 1;
        }
        int k=1;
        while (po1.next != po2){
            po1 = po1.next;
            k++;
        }
        po1 = root;
        po2 = root;
        while (k>1){
            po2 = po2.next;
            k--;
        }

        while (po2.next != po1){
            po1 = po1.next;
            po2 = po2.next;
        }
        po2.next = null;
        return 1;
    }

    private static void remove(Node loop, Node root) {
        Node po1 = null , po2 = null;
        po1 = root;
        while (true){
            po2 = loop;
            while (po2.next != loop && po2.next != po1){
                po2 = po2.next;
            }
            if (po2.next == po1){
                break;
            }
            po1 = po1.next;
        }
        po2.next = null;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = head.next.next;
        removeNode(head);
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data);
            curr = curr.next;
        }
    }
}
