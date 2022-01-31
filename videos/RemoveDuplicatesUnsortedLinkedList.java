package cp.videos;

public class RemoveDuplicatesUnsortedLinkedList {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }

        public LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
            LinkedListNode<Integer> curr = head;
            while (curr != null) {
                LinkedListNode<Integer> temp = curr;
                while (temp.next != null) {
                    if (temp.next.data == curr.data) {
                        temp.next = temp.next.next;
                        System.gc();
                    } else {
                        temp = temp.next;
                    }
                }
                curr = curr.next;
            }
            return head;
        }
    }
}
