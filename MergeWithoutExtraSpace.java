package cp;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public void merge(int arr1[], int arr2[], int n, int m) {
        int i=0, k=n-1, j=0;

        while(i<=k && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                int temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
