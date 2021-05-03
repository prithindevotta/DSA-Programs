package cp;

import java.util.Scanner;

public class SmallestPossible {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            long n = scan.nextLong();
            long k = scan.nextLong();
            if(k==0){
                System.out.println(n);
            }
            else {
                System.out.println(n%k);
            }
        }
    }
}
