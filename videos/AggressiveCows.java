package cp.videos;

import java.util.ArrayList;
import java.util.Collections;

public class AggressiveCows {
    static boolean isPossible(ArrayList<Integer> stalls, int mid, int k){
        int cows = 1;
        int init = stalls.get(0);
        for(int i=0; i<stalls.size(); i++){
            if(stalls.get(i)-init >= mid){
                cows++;
                if(cows == k){
                    return true;
                }
                init = stalls.get(i);
            }
        }
        return false;
    }
    public static int aggressiveCows(ArrayList<Integer> stalls, int k)
    {
        int s = 0;
        Collections.sort(stalls);
        int e = stalls.get(stalls.size()-1);
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e){
            if(isPossible(stalls, mid, k)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
}
