package cp;

import java.util.Map;
import java.util.Scanner;

public class RoyAndRangoli {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[2*n];
        for (int i=2; i*i<=2*(n-1); i++){
            if(arr[i]==0){
                for (int j=i*i; j<=2*(n-1); j=j+i){
                    arr[j] = 1;
                }
            }
        }
        int count=0;
        int m=1;
        for(int i=2; i<=2*(n-1); i++){
           if (arr[i]==0){
               if (i<=n-1){
                   m=i+1;
               }
               else{
                   m=2*(n-1)-i+1;
               }
               count = (count+m)%1000000007;
           }
        }
        System.out.println(count);
    }
}
