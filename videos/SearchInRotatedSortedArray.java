package cp.videos;

import java.util.ArrayList;

public class SearchInRotatedSortedArray {
    static int findPivot(ArrayList<Integer> arr, int n){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<e){
            if(arr.get(mid)>=arr.get(0)){
                s = mid+1;
            }
            else{
                e = mid;
            }
            mid = s+(e-s)/2;
        }
        if(arr.get(s) > arr.get(0)){
            return 0;
        }
        return s;
    }

    static int binarySearch(ArrayList<Integer> arr, int start, int end, int k){
        int s = start;
        int e = end-1;

        int mid = s+(e-s)/2;
        while(s<=e){
            if(arr.get(mid) == k){
                return mid;
            }
            else if(arr.get(mid) > k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }

    public static int findPosition(ArrayList<Integer> arr, int n, int k) {
        int pivot = findPivot(arr, n);
        if(k >= arr.get(pivot) && k<= arr.get(n-1)){
            return binarySearch(arr, pivot, n, k);
        }
        else{
            return binarySearch(arr, 0, pivot, k);
        }
    }
}
