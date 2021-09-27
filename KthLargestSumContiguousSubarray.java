package cp;

import java.util.PriorityQueue;

public class KthLargestSumContiguousSubarray {

    static int kthLargest(int[] arr, int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        int j=0;
        int sum = 0;
        while (i<n){
            if(j==n){
                i++;
                j = i;
                sum = 0;
            }
            if(j<n) {
                sum += arr[j];

                if (pq.size() < k) {
                    pq.add(sum);
                } else {
                    if (pq.peek() < sum) {
                        pq.poll();
                        pq.add(sum);
                    }
                }
            }
            j++;
        }
        return pq.poll();
    }

    public static void main(String[]  args){
        int[] arr = {10, -10, 20, -40};
        System.out.println(kthLargest(arr, 4, 6));
    }
}
