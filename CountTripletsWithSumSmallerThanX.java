package cp;

import java.util.ArrayList;
import java.util.Arrays;

public class CountTripletsWithSumSmallerThanX {
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        ArrayList<ArrayList<Long>> master = new ArrayList<>();
        long count = 0L;
        for(int i=0; i<n; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r] < sum){
                    count+= r-l;
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return count;
    }
}
