package cp;

import java.util.Scanner;

public class WeightBalance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int w1,w2,x1,x2,m;
            w1 = scan.nextInt();
            w2 = scan.nextInt();
            x1= scan.nextInt();
            x2= scan.nextInt();
            m = scan.nextInt();
            int w10 = w1+x1*m;
            int w11 = w1+x2*m;
            if (w2>=w10 && w2<=w11){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
    }
}
