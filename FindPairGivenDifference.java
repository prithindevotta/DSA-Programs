package cp;

import java.util.Arrays;

public class FindPairGivenDifference {
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int i=0, j=1;
        while(i<size && j<size){
            if(arr[j] - arr[i] == n){
                return true;
            }
            if(arr[j] - arr[i] > n){
                i++;
            }
            else{
                j++;
            }
        }
        return false;
    }
}
