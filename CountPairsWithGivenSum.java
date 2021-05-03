package cp;

import java.util.Arrays;

public class CountPairsWithGivenSum {
    public static int getPairsCount(int[] arr, int n, int k) {
        int count =0;
        int i=0;
        int j=n-1;
        Arrays.sort(arr);
        while (i<j){
            if (arr[i]+arr[j]==k){
                count++;
                int x = j;
                while(x>i+1 && arr[x-1]==arr[x]){
                    x--;
                    count++;
                }
            }
            if (arr[i]+arr[j]<=k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1,0};
        System.out.println(getPairsCount(arr, arr.length, 2));
    }
}
