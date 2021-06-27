package cp;

import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            if (n<9){
                System.out.println(n);
            }
            else {
                int count;
                int  i=1;
                while (n>=Math.pow(10, i)){
                    i++;
                }
                count =  9*(i-1);
                int div = 0;
                for (int j=i-1; j>=0; j--){
                    div = div+(int) Math.pow(10, j);
                }
                count = count+(n/div);
                System.out.println(count);
            }
        }
    }
}
