package cp;

import java.util.Scanner;

public class StrongLanguage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int a = scan.nextInt();
            String inp = scan.next();
            if (!inp.contains("*")){
                System.out.println("NO");
            }
            else {
                int count = 0;
                int flag = 0;
                for (int i=0; i<n; i++){
                    if (inp.charAt(i)=='*'){
                        count++;
                    }
                    else {
                        if (count>=a){
                            System.out.println("YES");
                            flag = 1;
                            break;
                        }
                        else {
                            count = 0;
                        }
                    }
                }
                if (count==a && flag==0){
                    System.out.println("YES");
                }
                if (count != a && flag==0){
                    System.out.println("NO");
                }
            }
        }
    }
}
