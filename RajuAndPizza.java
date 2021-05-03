package cp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RajuAndPizza {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            String a = scan.next();
            Integer[] arr = new Integer[n];
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            //Raju will always take even number
            if (arr.length==1 && a.equals("Raju")){
                if (arr[0]%2==0){
                    System.out.println("Raju");
                }
                else {
                    System.out.println("Shyam");
                }
            }
            else {
                System.out.println("Shyam");
            }
        }
    }
}
//2 Shyam
//89 86
