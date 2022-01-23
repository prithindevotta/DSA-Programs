package cp;

public class SearchingDifferByAtMostK {
    //O(N)
    //Making use of the information neighbours differ by at most k
    public static int search (int arr[], int n, int x, int k) {
        int i=0;
        while(i<n){
            if(arr[i] == x){
                return i;
            }
            i+=Integer.max(1, Math.abs((x - arr[i])/k));
        }
        return -1;
    }
}
