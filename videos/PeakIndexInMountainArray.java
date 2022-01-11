package cp.videos;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length-1;
        int mid = s+(e-s)/2;
        int ans = -1;
        while(s<=e){
            if(mid == 0){
                break;
            }
            if(arr[mid]<arr[mid-1]){
                ans = mid-1;
                e = mid-1;
            }
            else if(arr[mid]>arr[mid-1]){
                ans = mid;
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }

        return ans;
    }
}
