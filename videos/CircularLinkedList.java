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
        if(head.next == null){
            return false;
        }
        Node temp = head.next;
        while (temp.next != null && temp.next != head){
            temp = temp.next;
        }
        return temp.next != null;
    }
}
