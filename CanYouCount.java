package cp;

import java.util.Scanner;

public class CanYouCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            String a = scan.next();
            String vow = "aeiou";
            int count = 0;
            long ans=1;
            for (int i=0; i<a.length(); i++){
                if (vow.contains(String.valueOf(a.charAt(i)))){
                    vow = vow.replace(String.valueOf(a.charAt(i)), "");
                    count++;
                }
                else if (a.charAt(i)=='_'){
                    ans = ans*count;
                }
            }
            System.out.println(ans);
        }
    }
}
