package cp;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveDeletions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k= scan.nextInt();
            String a = scan.nextLine();
            int[] b =new int[a.length()];
            for (int i=0; i<a.length(); i++){
                b[i] = a.charAt(i)-'0';
            }
            int i=0;
            int j=k-1;
            int min=Integer.MAX_VALUE;
            int sum=0;
            while (j<b.length){
                for (int x=i; x<=j; x++){
                    sum = sum+b[x];
                }
                if (sum<min){
                    min=sum;
                }
                i++;
                j++;
            }
        }
    }
}
