package cp;
//230B codeforces
import java.util.ArrayList;
import java.util.Scanner;

public class TPrimes {
    static int[] arr;
    public static void main(String[] args){
        arr = new int[(int)1e6+10];
        prime();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            long n = scan.nextLong();
            double nd = (long)Math.sqrt(n);
            if(nd == Math.sqrt(n)){
                if (arr[(int)nd] == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }
        }
    }
    static void prime()
    {
        arr[1] = 1;
        for (int i = 2; i<(int)1e6+1; i+=1){
            if(arr[i] == 0){
                for (int j=2*i; j<1e6+1; j+=i){
                    arr[j] = 1;
                }
            }
        }
    }
}
