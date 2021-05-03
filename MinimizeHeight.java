package cp;

import java.util.Arrays;

public class MinimizeHeight {
    public static void main(String args[]) {
        int arrr[] = {2,6,3,4,7,2,10,3,2,1};
        System.out.println(getMinDiff(arrr, 5, 10));
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) {
            return 0;
        }
        int min=0, max=0;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        System.out.println(ans);
        for(int i=0; i<n; i++){
            System.out.println(arr[0] + k);
            System.out.println(arr[i] - k);
            min = Math.min(arr[0]+k, arr[i]-k);
            max = Math.max(arr[n-1]-k, arr[i]+k);
            System.out.println("max-min");
            System.out.println(max);
            System.out.println(min);
            ans = Math.min(ans, max-min);
            System.out.println(ans);
        }
        return ans;
    }
}


