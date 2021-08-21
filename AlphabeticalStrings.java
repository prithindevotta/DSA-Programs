package cp;

import java.util.Scanner;

public class AlphabeticalStrings {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            String a = scan.next();
            int flag = 0;
            for (int i=0; i<a.length(); i++){
                if (!a.contains(String.valueOf(alphabet[i]))){
                    flag = 1;
                    break;
                }
            }
            int i = a.indexOf(alphabet[0]);
            int j = i;
            for (int k=1; k<a.length(); k++){
                if (i<a.length()-1 && a.charAt(i+1) == alphabet[k]){
                    i++;
                }
                else if (j>0 && a.charAt(j-1) == alphabet[k]){
                    j--;
                }
                else {
                    flag = 1;
//                    System.out.println(i);
//                    System.out.println(j);
                    break;
                }
            }
            if (flag==1) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }

        }
    }
}
