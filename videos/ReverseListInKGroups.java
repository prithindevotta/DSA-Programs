package cp.videos;


public class ReverseListInKGroups {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node kReverse(Node head, int k) {
        if(head == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = kReverse(next, k);
        return prev;

    }
}
