package cp.videos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Eko {
    static boolean isPossible(ArrayList<Integer> arr, int mid, int m){
        int sum = 0;
        for(int i: arr){
            if(sum >= m){
                return true;
            }
            if(i>mid){
                sum+=(i-mid);
            }
        }
        return false;
    }
    static int findMaxHeight(ArrayList<Integer> arr, int m){
        int s = 0;
        Collections.sort(arr, Collections.reverseOrder());
        int e = arr.get(0);
        int mid = s+(e-s)/2;
        int ans = -1;
        while (s<=e){
            if(isPossible(arr, mid, m)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(42);
        arrayList.add(40);
        arrayList.add(26);
        arrayList.add(46);
        System.out.println(findMaxHeight(arrayList, 20));
    }
}
