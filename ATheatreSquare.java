package cp;

import java.util.Scanner;

public class ATheatreSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a = scan.nextInt();
        int ans=0;
        if(m%a != 0){
            ans += (m/a);
        }
        else{
            ans+=(m/a)-1;
        }
        if(n%a != 0){
            ans = ((n/a)+1)*ans+(n/a)+1;
        }
        else{
            ans = (n/a)*ans+(n/a);
        }
        System.out.println(ans);
    }
}
