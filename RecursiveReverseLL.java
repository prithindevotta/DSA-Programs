package cp;

public class RecursiveReverseLL {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    static Node recursiveList(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node rest = recursiveList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }
    public static void main(String[] args){
        Node ques = new Node(1);
        Node head = ques;
        for (int i=2; i<7; i++){
            Node add = new Node(i);
            ques.next = add;
            ques = add;
        }
        Node res = recursiveList(head);
        Node head_res = res;
        for (int i=0; i<6; i++){
            System.out.println(head_res.value);
            head_res = head_res.next;
        }
    }
}
