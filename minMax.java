package cp;

import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {
        MergeIntervals.FastReader scan = new MergeIntervals.FastReader();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        if (arr[n-1]-arr[0]==1){
            System.out.println("YES");
        }
        else{
            int j=1;
            int flag = 1;
            for(int i=arr[0]+1; i<=arr[n-1]; i++){
                if (arr[j]==i){
                    j++;
                    continue;
                }
                else if(arr[j]==i-1){
                    i--;
                    j++;
                    continue;
                }
                else {
                    flag = 0;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag==1){
                System.out.println("YES");
            }
        }
    }
}
