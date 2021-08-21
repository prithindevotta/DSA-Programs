package cp;

import java.util.Scanner;

public class PrintNumbersRecursion {

    static void countNumbersTail(int n){
        if (n == 0){
            return;
        }
        countNumbersTail(n-1);
        System.out.println(n);
    }
    static void countNumbersHead(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        countNumbersHead(n-1);
    }

    public static void main(String[] args){
        countNumbersHead(5);
    }
}
