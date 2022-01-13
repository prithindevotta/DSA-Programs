package cp.videos;

import java.util.ArrayList;

public class AllocateBooks {
    static boolean isPossible(ArrayList<Integer> arr, int mid, int m){
        int students = 1;
        int sum = 0;
        for(int i=0; i<arr.size(); i++){
            if(sum + arr.get(i) <=mid){
                sum+= arr.get(i);
            }
            else{
                students++;
                if(students > m || arr.get(i) > mid){
                    return false;
                }
                sum = arr.get(i);
            }
        }
        return true;
    }

    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        int s = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr.get(i);
        }
        int e = sum;
        int ans =-1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(isPossible(arr, mid, m)){
                ans = mid;
                e = mid -1;
            }
            else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
}
