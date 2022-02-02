package cp;

import cp.videos.MergeSortLL;

public class IntersectionOfTwoSortedLL {
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
    private static Node addLast(Node head, int data){
        if(head == null){
            head = new Node(data);
            head.next = null;
            return head;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;
    }
    private static Node mergeTwoSorted(Node ans1, Node ans2) {
        Node p1 = ans1;
        Node p2 = ans2;
        Node ans = null;
        while (p1 != null && p2 != null){
            if(p1.data < p2.data){
                p1 = p1.next;
            }
            else if(p2.data < p1.data){
                p2 = p2.next;
            }
            else{
                ans = addLast(ans, p1.data);
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return ans;
    }
    public static Node findIntersection(Node head1, Node head2)
    {
        return mergeTwoSorted(head1, head2);
    }
}
