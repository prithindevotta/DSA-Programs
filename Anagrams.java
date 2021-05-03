package cp;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            String a = scan.next();
            String b = scan.next();
            if(a.length()>b.length()){
                String temp = a;
                a=b;
                b=temp;
            }
            String bCopy = b;
            int remB=0;
            int remA=0;
            for(int i=0; i<a.length(); i++){
                if(b.contains(String.valueOf(a.charAt(i)))){
                    b = b.replaceFirst(String.valueOf(a.charAt(i)), "");
                    System.out.println(a.charAt(i));
                    remB++;
                }
                else{
                    remA++;
                }
            }
            System.out.println();
            System.out.println(remB);
            System.out.println(remA);
            int ans = (bCopy.length() - remB) + remA;
            System.out.println(ans);
        }
    }
}
