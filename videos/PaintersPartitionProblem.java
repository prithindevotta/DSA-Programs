package cp.videos;

import java.util.ArrayList;

public class PaintersPartitionProblem {
    static boolean isPossible(ArrayList<Integer> boards, int mid, int k){
        int painters = 1;
        int sum = 0;
        for(int i=0; i<boards.size(); i++){
            if(sum+boards.get(i) <= mid){
                sum+= boards.get(i);
            }
            else{
                painters++;
                if(painters > k || boards.get(i) > mid){
                    System.out.println(mid);
                    System.out.println("f");
                    return false;
                }
                sum = boards.get(i);
            }
        }
        System.out.println(mid);
        System.out.println("t");
        return true;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int s = 0;
        int sum=0;
        for (Integer board : boards) {
            sum += board;
        }
        int e = sum;
        int ans = -1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(isPossible(boards, mid, k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(findLargestMinDistance(arr, 2));
    }
}
