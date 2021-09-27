package cp;

import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

//    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
//    {
//        // Write your code here.
//
//        re
//    }

    public  static void main(String[] args){
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(2);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
