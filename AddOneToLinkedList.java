package cp;

public class AddOneToLinkedList {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static Node addOne(Node head)
    {
        add(null, head);
        return head;
    }
    public static int add(Node prev, Node head){
        if(head == null){
            return 1;
        }
        if(prev == null){
            int carry = add(head, head.next);
            head.data = head.data+carry;
            return 0;
        }
        int carry = add(head, head.next);
        if(head.data < 9){
            head.data = head.data+carry;
        }
        else{
            if(carry == 0){
                return 0;
            }
            head.data = 0;
            return 1;
        }
        return 0;
    }
}
