package cp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLinkedLists {
    static class Node
    {
        int data;
        Node next;

        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    static class comparator implements Comparator<Node> {
        @Override
        public int compare(Node a, Node o) {
            return Integer.compare(a.data,o.data);
        }
    }

    Node mergeKList(Node[]arr,int K)
    {
        PriorityQueue<Node> pq = new PriorityQueue<>(new comparator());
        for (int i = 0; i < K; i++) {
            pq.add(arr[i]);
        }
        Node head = null;
        if (!pq.isEmpty()) {
            Node root = pq.poll();
            head = root;
            if (root.next != null){
                pq.add(root.next);
            }
            while (!pq.isEmpty()) {
                Node temp = pq.poll();
                if(temp.next != null){
                    pq.add(temp.next);
                }
                root.next = temp;
                root = temp;
            }
        }
        return head;
    }

    public static void main(String[] args){

    }
}
