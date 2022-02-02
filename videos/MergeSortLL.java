package cp.videos;

import cp.AddTwoNumbersLL;

public class MergeSortLL {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
        void addLast(int data){
            Node temp = this;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    public static Node findMiddle(Node head, Node tail)
    {
        Node slow = head;
        Node fast = head;
        while(fast != tail && fast.next != tail){
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public static Node mergeSort(Node head, Node tail){
        if(head == null){
            return null;
        }
        if(head == tail){
            return new Node(head.data);
        }
        Node mid = findMiddle(head, tail);
        Node ans1 = mergeSort(mid.next, tail);
        Node ans2 = mergeSort(head, mid);

        return mergeTwoSorted(ans1, ans2);
    }

    private static Node mergeTwoSorted(Node ans1, Node ans2) {
        Node p1 = ans1;
        Node p2 = ans2;
        Node ans;
        if(p1.data < p2.data){
            ans = new Node(p1.data);
            p1 = p1.next;
        }
        else if(p2.data < p1.data){
            ans = new Node(p2.data);
            p2 = p2.next;
        }
        else{
            ans = new Node(p1.data);
            ans.addLast(p2.data);
            p1 = p1.next;
            p2 = p2.next;
        }
        while (p1 != null && p2 != null){
            if(p1.data < p2.data){
                ans.addLast(p1.data);
                p1 = p1.next;
            }
            else if(p2.data < p1.data){
                ans.addLast(p2.data);
                p2 = p2.next;
            }
            else{
                ans.addLast(p1.data);
                ans.addLast(p2.data);
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        while (p1 != null){
            ans.addLast(p1.data);
            p1 = p1.next;
        }
        while (p2 != null){
            ans.addLast(p2.data);
            p2 = p2.next;
        }
        return ans;
    }
    static void print(Node head){
        if (head == null){
            return;
        }
        Node curr = head.next;
        System.out.print(head.data+" ");
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(7);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(3);
        Node tail = head.next.next.next.next.next.next;
        Node ans = mergeSort(head, tail);
        print(ans);
    }
}
