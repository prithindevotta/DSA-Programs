package cp.videos;

import java.util.ArrayList;
import java.util.Arrays;
//https://www.codingninjas.com/codestudio/problems/triplets-with-given-sum_893028?source=youtube&campaign=LoveBabbar_Codestudiovideo1&utm_source=youtube&utm_medium=affiliate&utm_campaign=LoveBabbar_Codestudiovideo1

public class TripletsWithGivenSum {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int start = i+1;
            int end = n-1;
            while(start<end){
                if(arr[i]+arr[start]+arr[end] == K){
                    ArrayList<Integer> child = new ArrayList<>();
                    child.add(arr[i]);
                    child.add(arr[start]);
                    child.add(arr[end]);
                    ans.add(child);
                    int x = arr[start];
                    int y = arr[end];
                    while(start<end && arr[start] == x){
                        start++;
                    }
                    while(start<end && arr[end] == y){
                        end--;
                    }
                }
                else if(arr[i]+arr[start]+arr[end] <K){
                    start++;
                }
                else{
                    end--;
                }
            }
            while(i<n-1 && arr[i+1] == arr[i]){
                i++;
            }
        }
        return ans;
    }
}
