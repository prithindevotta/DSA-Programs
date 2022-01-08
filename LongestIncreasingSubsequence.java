package cp;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    static int[] dp;

    static int lis(int[] arr, int n){
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = 1;
        for(int i=0; i<n; i++){
            if(arr[n-1]>arr[i]){
                dp[n] = Integer.max(dp[n], 1+lis(arr, i+1));
            }
        }
        return dp[n];
    }

    public static void main(String[] args){
        dp = new int[16];
        Arrays.fill(dp, -1);
        int[] arr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int n = 16;
        dp[0] = 1;
        int ans = -1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i] >= arr[j]){
                    dp[i] = Integer.max(dp[i], 1+dp[j]);
                }
            }
            ans = Integer.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}
