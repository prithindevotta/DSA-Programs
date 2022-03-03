package cp;

public class IntersectionPointLL {
    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    int intersectPoint(Node head1, Node head2){
        Node temp = head1;
        int count1 = 0, count2 = 0;
        while(temp != null){
            count1++;
            temp = temp.next;
        }
        temp = head2;
        while(temp != null){
            count2++;
            temp = temp.next;
        }
        int d = Math.abs(count1-count2);
        if(count1>count2){
            while(d-->0){
                head1 = head1.next;
            }
        }
        else if(count2>count1){
            while(d-->0){
                head2 = head2.next;
            }
        }
        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1.data;
    }
}
