package cp.CodingNinjas;

public class SwapTwoNodesLL {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        LinkedListNode<Integer> prev1 = null;
        LinkedListNode<Integer> prev2 = null;
        LinkedListNode<Integer> temp = head;
        if(j==i){
            return head;
        }
        if(j<i){
            int tp = j;
            j = i;
            i = tp;
        }
        while(j>0 && temp != null){
            if(i > 0){
                prev1 = temp;
                i--;
            }
            prev2 = temp;
            j--;
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        if(prev1.next == prev2){
            prev1.next = prev2.next;
            LinkedListNode<Integer> swap2 = prev2.next.next;
            prev2.next.next = prev2;
            prev2.next = swap2;
        }
        else{
            LinkedListNode<Integer> swap1 = prev1.next;
            prev1.next = prev2.next;
            LinkedListNode<Integer> swap2 = prev2.next.next;
            prev2.next.next = swap1.next;
            swap1.next = swap2;
            prev2.next = swap1;
        }
        return head;
    }
}
