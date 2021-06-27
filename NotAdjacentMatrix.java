package cp;

import java.util.Scanner;

public class NotAdjacentMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            if (n==2){
                System.out.println("-1");
            }
            else{
                int k=1;
                int [][] arr= new int[n][n];
                for (int i=0; i<n; i++){
                    for (int j=0; j<n; j++){
                        arr[i][j] = k;
                        k++;
                    }
                }
                int temp, temp1;
                for (int i=1; i<n; i=i+2){
                    temp = arr[0][i];
                    arr[0][i] = arr[n-1][i];
                    for (int j=1; j<n; j++){
                        temp1 = arr[j][i];
                        arr[j][i] = temp;
                        temp = temp1;
                    }
                }
                for (int i=0; i<n; i++){
                    for (int j=0; j<n; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
