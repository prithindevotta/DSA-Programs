package cp;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] player_1 = new int[n];
        int[] player_2 = new int[n];

        for (int i=0; i<n; i++){
            if(i==0){
                player_1[i] = scan.nextInt();
                player_2[i] = scan.nextInt();
            }
            else{
                player_1[i] = player_1[i-1]+scan.nextInt();
                player_2[i] = player_2[i-1]+scan.nextInt();
            }
        }
        int[] diff = new int[n];
        for(int i=0; i<n; i++){
            diff[i] = player_1[i] - player_2[i];
        }
        Arrays.sort(diff);
        if(Math.abs(diff[0])>Math.abs(diff[n-1])){
            System.out.println("2 "+ Math.abs(diff[0]));
        }
        else{
            System.out.println("1 "+Math.abs(diff[n-1]));
        }*/
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->=0){
            int len = scan.nextInt();
            int[] ot = new int[len];
            int[] vis = new int[(2*len)+1];
            for(int i=0; i<len; i++){
                ot[i] = scan.nextInt();
            }
            int count=0;
            int sum=0;
            int i=0, j=0;
            while(i != len){
                if(sum>=1 && sum<=(2*len)) {
                    if (vis[sum] == 0) {
                        count++;
                        vis[sum] = 1;
                    }
                }
                if(j==len || sum>(2*len)){
                    i++;
                    j=i;
                    sum=0;
                }
                if(j<len){
                    sum=sum+ot[j];
                    j++;
                }
            }
            System.out.println(count);
        }
    }
}

