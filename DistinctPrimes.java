package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class DistinctPrimes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        int max = 1000000;
        int[] notPrime = new int[max];
        notPrime[0] = 1;
        notPrime[1] = 1;
        for (int i=2; i*i<max; i++){
            if (notPrime[i]==0){
                for (int j=i*i; j<max; j+=i){
                    notPrime[j] = 1;
                }
            }
        }
        LinkedList<Integer> prime = new LinkedList();
        for (int p=0; p<max; p++){
            if (notPrime[p]==0){
                prime.add(p);
            }
        }
        while (t-->0){
            int n = scan.nextInt();
            int last = prime.get(n+1);
            System.out.println(2 * 3 * last);
        }
    }
}
