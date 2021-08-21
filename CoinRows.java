package cp;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//https://codeforces.com/contest/1555/problem/C
public class CoinRows {

    static int recur(int x, int y, int xf, int yf, int[][] vis, int[][] mat){
        vis[x][y] = 1;
        if(x == xf && y==yf){
            int [] arrx = new int[2];
            int [] arry = new int[2];
            int count = 0;
            for (int i=0; i<2; i++){
                for(int j=0; j<yf; j++){
                    if (vis[i][j] == 0){
                        arry[count] = mat[i][j];
                        arrx[count] = j;
                        count++;
                    }
                }
            }
            if (arrx[1] - arrx[0] == 1){
                return arry[0] + arry[1];
            }
            else {
                return Math.max(arry[0], arry[1]);
            }
        }
        int ans1 = Integer.MAX_VALUE, ans2 = Integer.MAX_VALUE;
        if(x+1<2 && vis[x+1][y] != 1){
            ans1 =  recur(x+1, y, xf, yf, vis, mat);
        }
        if(y+1<=yf && vis[x][y+1] != 1){
            ans2 =  recur(x, y+1, xf, yf, vis, mat);
        }
        return Math.min(ans1, ans2);
    }

    public static void main(String[] ars){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int m = scan.nextInt();
            int[][] vis = new int[2][m];
            int[][] mat = new int[2][m];
            for (int i=0; i<2; i++){
                for (int j=0; j<m; j++){
                    mat[i][j] = scan.nextInt();
                }
            }
            System.out.println(recur(0, 0, 1, m-1, vis, mat));
        }
    }
}
