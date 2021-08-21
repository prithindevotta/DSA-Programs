package cp;

import java.util.Scanner;

public class WordWrap {
    public static int solveWordWrap (int[] nums, int k){
        int n = nums.length;
        int[] dp = new int[n];
        int currLen;
        int cost;

        dp[n-1] = 0;
        for (int i=n-2; i>=0; i--){
            currLen = -1;
            dp[i] = Integer.MAX_VALUE;

            for (int j=i; j<n; j++){
                currLen += nums[j]+1;

                if (currLen>k){
                    break;
                }
                if (j == n-1){
                    cost = 0;
                }
                else{
                    cost = (k-currLen)*(k-currLen) + dp[j+1];
                }
                if (cost<dp[i]){
                    dp[i] = cost;
                }
            }
        }
        return dp[0];
    }

    static int[] minCost;

    private static int solve(int[] nums, int k, int i) {
        if (i == nums.length-1){
            return 0;
        }
        int j=i;
        int sum = 0, cost, space = 0;
        int minCost = Integer.MAX_VALUE;
        while (j<nums.length && sum+nums[j]+space<=k){
            if (j==nums.length-1){
                return 0;
            }
            sum = sum+nums[j];
            cost = solve(nums, k, j+1) + (k-sum-space)*(k-sum-space);
            if (cost<minCost){
                minCost = cost;
            }
            space++;
            j++;
        }
        return minCost;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = {3,2,2};
        System.out.println(solveWordWrap(arr, 4));
    }
}
