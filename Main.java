package cp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        while (q-->0){
            int t = scan.nextInt();
            int a = scan.nextInt();
            if (t==2){


            }
            if (t==1){
                arr[a-1] = 1-arr[a-1];
            }
        }
    }
}
