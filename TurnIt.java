package cp;

import java.util.Scanner;

public class TurnIt{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int u = scan.nextInt();
            int v = scan.nextInt();
            int a = scan.nextInt();
            int s = scan.nextInt();
            if (v == u){
                System.out.println("YES");
            }
            else {
                if (v*v < (u*u - 2*a*s)){
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}
