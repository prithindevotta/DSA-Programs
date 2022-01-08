package cp;

import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][3];
        int count = 0;
        for(int i=0; i<n; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
            arr[i][2] = scan.nextInt();
            if(arr[i][0]+arr[i][1]+arr[i][2] >=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
