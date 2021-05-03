package cp;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            double k1 = scan.nextDouble();
            double k2 = scan.nextDouble();
            double k3 = scan.nextDouble();
            double v = scan.nextDouble();
            double mul = (k1*k2*k3*v);
            double ans = Math.round(10000.0/mul)/100.0;
            System.out.println(ans);
            if (ans<9.58){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
