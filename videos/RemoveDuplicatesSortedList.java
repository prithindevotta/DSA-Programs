package cp.videos;

public class RemoveDuplicatesSortedList {
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
    public static Node uniqueSortedList(Node head) {
        Node curr = head;
        while(curr != null){
            if(curr.next != null && curr.data == curr.next.data){
                Node temp = curr.next.next;
                curr.next.next = null;
                curr.next = temp;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}
