package cp;

import java.util.Scanner;

public class FriendRelationship {
    static void repeat(int j, int l){
        printStar(j+1);
        printHash(l-(2*(j+1)));
        printStar(j+1);
    }
    static void printStar(int s){
        if(s>0){
            System.out.print("*");
            printStar(s-1);
        }
    }
    static void printHash(int s){
        if(s>0){
            System.out.print("#");
            printHash(s-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner((System.in));
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int l = scan.nextInt();
            for(int j=0; j<l; j++){
                repeat(j, 2*l);
                System.out.println();
            }
        }
    }
}
/*
3
        9
        *################*
        **##############**
        ***############***
        ****##########****
        *****########*****
        ******######******
        *******####*******
        ********##********
        ******************
        2
        *##*
        ****
        5
        *########*
        **######**
        ***####***
        ****##****
        **********
*/
