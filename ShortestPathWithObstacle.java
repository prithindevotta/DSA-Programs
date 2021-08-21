package cp;

import java.util.Scanner;

public class ShortestPathWithObstacle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int st_x = scan.nextInt();
            int st_y = scan.nextInt();
            int end_x = scan.nextInt();
            int end_y = scan.nextInt();
            int f_x = scan.nextInt();
            int f_y = scan.nextInt();
            if (st_x == end_x && st_x == f_x){
                int ans;
                if (f_y>st_y && f_y<end_y || f_y<st_y && f_y>end_y){
                    ans = Math.abs(end_y - st_y) + 2;
                }
                else {
                    ans = Math.abs(end_y - st_y);
                }
                System.out.println(ans);

            }
            else if (st_y == end_y && st_y == f_y){
                int ans;
                if (f_x>st_x && f_x<end_x || f_x<st_x && f_x>end_x){
                    ans = Math.abs(end_x - st_x) + 2;
                }
                else {
                    ans = Math.abs(end_x - st_x);
                }
                System.out.println(ans);
            }
            else {
                int ans = Math.abs(end_y - st_y) + Math.abs(end_x - st_x);
                System.out.println(ans);
            }
        }
    }
}
