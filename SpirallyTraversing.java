package cp;

import java.util.ArrayList;
import java.util.Scanner;

public class SpirallyTraversing {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int k = 1;
        int[][] arr = new int[r][c];
        int[][] vis = new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr[i][j] = k;
                k++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0, i=0, j=0;
        while(count < 2){
            while (j<c){
                if (vis[i][j] != 1){
                    list.add(arr[i][j]);
                    count=0;
                    vis[i][j] = 1;
                    j++;
                }
                else {
                    count++;
                    break;
                }
            }
            j--;
            i++;
            while (i<r){
                if (vis[i][j] != 1){
                    list.add(arr[i][j]);
                    count=0;
                    vis[i][j] = 1;
                    i++;
                }
                else {
                    count++;
                    break;
                }
            }
            i--;
            j--;
            while (j>=0){
                if (vis[i][j] !=1){
                    list.add(arr[i][j]);
                    count=0;
                    vis[i][j] = 1;
                    j--;
                }
                else {
                    count++;
                    break;
                }
            }
            j++;
            i--;
            while (i>=0){
                if (vis[i][j] !=1){
                    list.add(arr[i][j]);
                    count=0;
                    vis[i][j] = 1;
                    i--;
                }
                else {
                    count++;
                    break;
                }
            }
            i++;
            j++;
        }
    }
}
