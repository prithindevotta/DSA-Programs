package cp;

import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestRangeInKLists {
    public static void main(String[] args){

    }
    public static class QueueNode implements Comparable<QueueNode>{
        int array, index, value;

        public QueueNode(int array, int index, int value){
            this.array = array;
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(QueueNode o) {
            return Integer.compare(value, o.value);
        }
    }

    static int[] findSmallestRange(int[][] arr,int n,int k) {
        PriorityQueue<QueueNode> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        int min;
        int range = Integer.MAX_VALUE;
        int start = -1, end = -1;
        for (int i = 0; i < k; i++) {
            pq.add(new QueueNode(i, 0, arr[i][0]));
            if (arr[i][0] > max) {
                max = arr[i][0];
            }
        }
        while (true){
            QueueNode node = pq.peek();
            min = node.value;
            if (max-min+1 < range){
                range = max-min+1;
                start = min;
                end = max;
            }
            if (node.index+1<n){
                pq.poll();
                pq.add(new QueueNode(node.array, node.index+1, arr[node.array][node.index+1]));
                if (max < arr[node.array][node.index+1]){
                    max = arr[node.array][node.index+1];
                }
            }
            else {
                break;
            }
        }
        int[] ans = {start, end};
        return ans;
    }
}