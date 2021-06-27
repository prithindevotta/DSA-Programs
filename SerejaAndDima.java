package cp;

import java.util.Scanner;

//code forces
// 2 pointer
public class SerejaAndDima {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int sereja = 0, dima=0;
        int i=0,j=n-1, s=0;
        while (i<=j){
            if (s==0){
                if (arr[i]<=arr[j]){
                    sereja += arr[j];
                    j--;
                }
                else {
                    sereja += arr[i];
                    i++;
                }
                s=1;
            }
            else {
                if (arr[i]<=arr[j]){
                    dima += arr[j];
                    j--;
                }
                else {
                    dima += arr[i];
                    i++;
                }
                s=0;
            }
        }
        System.out.println(sereja+" "+dima);
    }
}
