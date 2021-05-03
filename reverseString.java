package cp;

import java.util.Scanner;

public class reverseString {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int trials = scan.nextInt();
        scan.nextLine();
        while (trials-- >0) {
            String inp = scan.nextLine();
            char arr[] = new char[inp.length()];
            for (int i = 0; i < inp.length(); i++) {
                arr[(inp.length() - 1) - i] = inp.charAt(i);
            }
            System.out.println(arr);
        }
    }
}