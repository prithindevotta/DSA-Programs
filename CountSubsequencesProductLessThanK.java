package cp;

import java.util.Arrays;
import java.util.Scanner;

public class CountSubsequencesProductLessThanK {
    static int[][] dp;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        dp = new int[n+1][k+1];
        for(int i=0; i<n+1; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(plk(arr, n, k));
    }

    static int plk(int[] arr, int n, int k){
        if(n == 0){
            return 0;
        }
        if(dp[n][k] != -1){
            return dp[n][k];
        }
        if(arr[n-1]<=k && arr[n-1]>0){
            return dp[n][k] = 1+plk(arr, n-1, k/arr[n-1]) + plk(arr, n-1, k);
        }
        else{
            return dp[n][k] = plk(arr, n-1, k);
        }
    }

}
