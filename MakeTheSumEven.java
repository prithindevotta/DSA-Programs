package cp;

import java.util.LinkedList;
import java.util.Scanner;

public class MakeTheSumEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            LinkedList<Long> even = new LinkedList<>();
            LinkedList<Long> odd = new LinkedList<>();
            long oddSum = 0;
            for (int i=0; i<n; i++){
                Long in = scan.nextLong();
                if (in%2==0){
                    even.add(in);
                }
                else {
                    odd.add(in);
                    oddSum = oddSum+in;
                }
            }
            if (odd.size()%2==0){
                System.out.println("0");
            }
            else if (even.contains(2L)){
                System.out.println("1");
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
