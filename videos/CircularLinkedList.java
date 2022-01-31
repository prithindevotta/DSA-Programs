package cp.videos;

public class CircularLinkedList {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Boolean circular(Node head){
        if(head == null){
            return false;
        }
        Node temp = head.next;
        while (temp != null && temp != head){
            temp = temp.next;
        }
        return temp != null;
    }
}
