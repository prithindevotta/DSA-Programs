package cp;
//https://codeforces.com/contest/1555/problem/B
import java.util.Scanner;

public class TwoTables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int w = scan.nextInt();
            int h = scan.nextInt();
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int u1 = scan.nextInt();
            int u2 = scan.nextInt();
            if((u2+y2-y1 > h) && (u1+x2-x1>w)){
                System.out.println(-1);
            }
            else {
                int ans = Integer.MAX_VALUE;
                if(u2 + y2-y1 <=h){
                    ans = Math.min(ans, Math.min(y2-(h-u2), u2-y1));
                }
                if(u1 + x2-x1 <= w){
                    ans = Math.min(ans, Math.min(x2 - (w-u1), u1 - x1));
                }
                ans = Math.max(ans, 0);
                System.out.println(ans);
            }
        }
    }
}
