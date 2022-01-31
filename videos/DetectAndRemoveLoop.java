package cp.videos;

public class DetectAndRemoveLoop {
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
    public static Node loopDetection(Node head){
        Node fast = head;
        Node slow = head;

        while(slow != null && fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }
            slow = slow.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
    public static Node removeLoop(Node head) {
        if(head == null){
            return head;
        }
        Node intersection = loopDetection(head);
        if(intersection == null){
            return head;
        }
        Node temp = head;
        while(temp != intersection){
            temp = temp.next;
            intersection = intersection.next;
        }
        while(temp.next != intersection){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
