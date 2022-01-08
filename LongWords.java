package cp;

import java.util.Scanner;

public class LongWords {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            while(t-->0){
                String s = scan.next();
                if(s.length() <= 10){
                    System.out.println(s);
                }
                else{
                    System.out.println(Character.toString(s.charAt(0))+(s.length()-2)+ s.charAt(s.length() - 1));
                }
            }

        }
}
