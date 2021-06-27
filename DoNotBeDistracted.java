package cp;

import java.util.LinkedList;
import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            String in = scan.next();
            char[] arr = in.toCharArray();
            LinkedList<Character> ll = new LinkedList<>();
            int flag = 0;
            for (int i=0; i<n-1; i++){
                if(!ll.isEmpty() && ll.contains(arr[i])){
                    flag=1;
                    break;
                }
                if (arr[i] != arr[i + 1]) {
                    ll.add(arr[i]);
                }
            }
            if(!ll.isEmpty() && ll.contains(arr[n-1]) && flag != 1){
                flag=1;
            }
            if (flag==1){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
