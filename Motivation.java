package cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Motivation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            long maxRate = 0;
            for (int i=0; i<n; i++){
                long s = scan.nextLong();
                long r = scan.nextLong();
                if (s<=x){
                    if (r>maxRate){
                        maxRate = r;
                    }
                }
            }
            System.out.println(maxRate);
        }
    }
}
