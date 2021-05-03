package cp;

import java.util.Scanner;

public class Cdoubled {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        String n = scan.nextLine();
        int count =0;
        int levels = n.length()%2;
        int i=2;
        while (i != levels*2){
            if (i != levels*2){
                count = count+9;
                i++;
            }
            else {
                String a = n.substring(0, n.length()/2);
                int b = 0;
                int mul=1;
                while(b<a.length()){
                    mul=mul*((a.toCharArray()[b]-'0')+1);
                    b++;
                }
                count=count+mul;
                i++;
            }
        }
        System.out.println(count);
    }
}
