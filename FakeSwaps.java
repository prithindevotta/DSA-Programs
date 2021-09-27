package cp;

import java.util.ArrayList;
import java.util.Scanner;

public class FakeSwaps {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            String first = scan.next();
            String last= scan.next();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = first.charAt(i)-'0';
            }
            for(int i=0; i<n; i++){
                arr2[i] = last.charAt(i)-'0';
            }

            ArrayList<Integer> ans1 = new ArrayList<>();
            ArrayList<Integer> ans2 = new ArrayList<>();
            int count = 0;
            for (int i=0; i<n; i++){
                if (arr1[i] != arr2[i]){
                    ans1.add(arr1[i]);
                    ans2.add(arr2[i]);
                    count++;
                }
            }
            if (count>3){
                System.out.println("NO");
            }
            else {
                int sum = 0;
                for (int i=0; i<ans1.size(); i++){
                    sum = sum+(ans1.get(i) - ans2.get(i));
                }
                if (sum ==1 || sum==-1 || sum == 0){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
