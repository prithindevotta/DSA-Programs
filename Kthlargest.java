package cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kthlargest {

    static ArrayList<Integer> kLargest(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<k; i++){
            pq.add(arr[i]);
        }
        for (int i=k; i<n; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> arlist = new ArrayList<>();
        for (int i = 0; i<k; i++){
            arlist.add(pq.poll());
        }
        arlist.sort(Collections.reverseOrder());
        return arlist;
    }

    public static void main(String[] args){
        int[] arr = {12,5,787,1,23};
        System.out.println(kLargest(arr, arr.length, 2));
    }
}
