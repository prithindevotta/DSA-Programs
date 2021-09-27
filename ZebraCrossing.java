package cp;

import java.util.Scanner;

public class ZebraCrossing {
    static int recurr(int[] arr, int s, int count){
        if(count == 0){
            return s;
        }
        else if(s>= arr.length-1){
            return 0;
        }
        int maxval = s;
        int val=s;
        for (int i=s+1; i<arr.length; i++){
            if(arr[i] != arr[s]){
                val = recurr(arr, i, count-1);
            }
            if(maxval<val){
                maxval = val;
            }
        }
        return maxval;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            String num = scan.next();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = num.charAt(i)-'0';
            }
            int ans = recurr(arr, 0, k);
            if (ans == 0){
                System.out.println("-1");
            }
            else{
                System.out.println(ans+1);
            }
        }
    }
}
