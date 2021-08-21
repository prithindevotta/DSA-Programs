package cp;
//https://codeforces.com/contest/1555/problem/A
import java.util.Scanner;

public class PizzaForces {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            long n = scan.nextLong();
            if(n%2 != 0){
                n++;
            }
            if (n<=6){
                System.out.println(15);
            }
            else {
                System.out.println((n / 2) * 5);
            }
        }
    }
}
