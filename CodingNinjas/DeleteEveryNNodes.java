package cp.CodingNinjas;

public class DeleteEveryNNodes {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        if(M == 0){
            return null;
        }
        LinkedListNode<Integer> temp = head;
        while(temp != null){
            int m = M;
            int n = N;
            while(temp != null && m>1){
                temp = temp.next;
                m--;
            }
            if(temp == null){
                break;
            }
            while(temp.next != null && n>0){
                temp.next = temp.next.next;
                n--;
            }
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}
