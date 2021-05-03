package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        in = in.substring(1, in.length()-1);
        if (in.isEmpty()){
            System.out.println("0");
        }
        else {
            String[] arr = in.split(", ");
            LinkedList<String> ll  = new LinkedList<>();
            for (String i: arr){
                if (ll.isEmpty()){
                    ll.add(i);
                }
                else {
                    if (!ll.contains(i)){
                        ll.add(i);
                    }
                }
            }
            System.out.println(ll.size());
        }
    }
}
