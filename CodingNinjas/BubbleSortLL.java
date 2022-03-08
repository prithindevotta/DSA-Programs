package cp.CodingNinjas;

public class BubbleSortLL {
    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> temp;
        while(tail != head){
            temp = head;
            while(temp != tail && temp.next != tail){
                if(temp.data > temp.next.data){
                    int tp = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tp;
                }
                temp = temp.next;
            }
            tail = temp;
        }
        return head;
    }
}
