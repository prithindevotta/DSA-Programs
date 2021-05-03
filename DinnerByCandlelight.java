package cp;

import java.util.Scanner;

public class DinnerByCandlelight {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            long a = scan.nextLong();
            long y = scan.nextLong();
            long x = scan.nextLong();

            if (a<y){
                System.out.println(1+(a*x));
            }
            else if (a==y){
                System.out.println(a*x);
            }
            else {
                System.out.println(y*x);
            }
        }
    }
}
