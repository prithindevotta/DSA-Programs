package cp;

public class SticklerThief {
    public int FindMaxSum(int arr[], int n)
    {
        int incl = arr[0];
        int excl = 0;

        for(int i=1; i<n; i++){
            int temp_excl = Integer.max(incl, excl);

            incl = excl+arr[i];
            excl = temp_excl;
        }
        return Integer.max(incl, excl);
    }
}
