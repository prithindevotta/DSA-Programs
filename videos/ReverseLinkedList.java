package cp.videos;

public class ReverseLinkedList {
    static class LinkedListNode<T>
    {
        T data;
        LinkedListNode<T> next;
        public LinkedListNode(T data)
        {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> forward;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public static LinkedListNode<Integer> recurse(LinkedListNode<Integer> node){
        if(node == null || node.next ==  null){
            return node;
        }
        LinkedListNode<Integer> head = recurse(node.next);
        node.next.next = node;
        node.next = null;
        return head;
    }
}
