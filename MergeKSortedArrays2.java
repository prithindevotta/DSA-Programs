package cp;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays2 {

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

    public static ArrayList<Integer> mergeKArrays2(int[][] arr, int k)
    {
        PriorityQueue<QueueNode> pq = new PriorityQueue<>();
        for (int i=0; i<arr.length; i++){
            if(arr[i].length > 0){
                pq.add(new QueueNode(i, 0, arr[i][0]));
            }
        }
        ArrayList<Integer> arlist = new ArrayList<>();
        while (!pq.isEmpty()){
            QueueNode n = pq.poll();
            arlist.add(n.value);
            if(n.index+1 < arr[n.array].length){
                pq.add(new QueueNode(n.array, n.index+1, arr[n.array][n.index+1]));
            }
        }
        return arlist;
    }


    public static void main(String[] args){
    }
}
