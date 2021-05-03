package cp;

import java.util.Scanner;

public class ballonColour {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int j=0; j<t; j++){
            int N, X, Y, count=0;
            N = scan.nextInt();
            X = scan.nextInt();
            Y = scan.nextInt();
            for(int i=0; i<N; i++){
                int a = scan.nextInt();
                if(i==0 && a==X){
                    count += 1;
                }
                else if(i==(N-1) && a==Y){
                    count += (N-1);
                }
            }
            if(count == 0) System.out.println("OKAY");
            if(count == 1) System.out.println("EASY");
            if(count == (N-1)) System.out.println("HARD");
            if(count == N) System.out.println("BOTH");
        }
        }
}
