package cp;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllFourSumNumbers {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> master = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int find = k - arr[i]-arr[j];
                int l = j+1;
                int r = n-1;
                while(l<r){
                    if(arr[l]+arr[r] == find){
                        ArrayList<Integer> arl = new ArrayList<>();
                        arl.add(arr[i]);
                        arl.add(arr[j]);
                        arl.add(arr[l]);
                        arl.add(arr[r]);
                        if(!master.contains(arl)){
                            master.add(arl);
                        }
                        l++;
                        r--;
                    }
                    else if(arr[l]+arr[r]<find){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return master;
    }
}
