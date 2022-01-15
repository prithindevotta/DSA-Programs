package cp.videos;

import java.util.ArrayList;
import java.util.Collections;

public class CookingNinjas {
    static boolean isPossible(ArrayList<Integer> rank, int mid, int m){
        int dishes = 0;
        for(int i: rank){
            dishes += (-1 + Math.sqrt(1+(8*mid/i)))/2;
            if(dishes >= m){
                return true;
            }
        }
        return false;
    }
    public static int minCookTime(ArrayList<Integer> rank, int m)
    {
        int s=0;
        int sum = 0;
        Collections.sort(rank);
        int high = rank.get(rank.size()-1);
        for(int i=1; i<=m; i++){
            sum += high*i;
        }
        int e = sum;
        int ans = -1;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(isPossible(rank, mid, m)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
