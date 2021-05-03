package cp;

import java.util.Scanner;

public class ChefAndDice {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            long n = scan.nextLong();
            long max = 21*n;
            long ans=0;
            if (n%4==0){
                if (n==0){
                    ans = max;
                }
                else if (n==4){
                    ans = max-24;
                }
                else {
                    ans = max-((n/4)-1)*40;
                    ans = ans-24;
                }
            }
            else if (n%4==1){
                if (n==1){
                    ans = max-1;
                }
                else if (n==5){
                    ans = max-29;
                }
                else {
                    ans = max-((n/4)-1)*40;
                    ans = ans-29;
                }
            }
            else if (n%4==2){
                if (n==2){
                    ans = max-6;
                }
                else if (n==6){
                    ans = max-38;
                }
                else {
                    ans = max-((n/4)-1)*40;
                    ans = ans-38;
                }
            }
            else if (n%4==3){
                if (n==3){
                    ans = max-12;
                }
                else if (n==7){
                    ans = max-48;
                }
                else {
                    ans = max-((n/4)-1)*40;
                    ans = ans-48;
                }
            }
            System.out.println(ans);
        }
    }
}
