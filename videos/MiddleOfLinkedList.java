package cp.videos;

public class MiddleOfLinkedList {
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
    public static Node findMiddle(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }
            slow = slow.next;
        }
        return slow;
    }
}
