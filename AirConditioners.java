package cp;

import java.util.Scanner;

public class AirConditioners {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] ind = new int[k];
            int[] temp = new int[k];
            for (int i=0; i<k; i++){
                ind[i]  = scan.nextInt();
            }
            for (int i=0; i<k; i++){
                temp[i]  = scan.nextInt();
            }

            for (int i=0; i<n; i++){
                int ans = Integer.MAX_VALUE;
                for (int j=0; j<k; j++){
                    if (temp[j] + Math.abs(ind[j] - (i+1)) < ans){
                        ans = temp[j] + Math.abs(ind[j] - (i+1));
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
