package cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class frogJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
           int n = scan.nextInt();
            int[] w = new int[20];
            int[] l = new int [n+1];
            for (int i=0; i<n; i++){
                w[i]= scan.nextInt();
            }
            for(int i=0; i<n; i++){
                l[w[i]] = scan.nextInt();
            }
            int count=0;
           if(n==2){
               if(w[0]<w[1]){
                   System.out.println("0");
               }
               else{
                   int i=0;
                   while(i<=1){
                       i = i+l[w[0]];
                       count++;
                   }
               }
               System.out.println(count);
           }
           if(n==3){
               int[] jump = new int[n];
               for(int i=0; i<n; i++){

               }
           }

        }
    }
}
