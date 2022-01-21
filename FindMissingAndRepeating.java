package cp;

public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index] < 0){
                ans[0] = Math.abs(arr[i]);
            }
            else{
                arr[index] = -1 * arr[index];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                ans[1] = i+1;
            }
        }

        return ans;
    }
}
