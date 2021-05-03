package cp;

import java.util.Arrays;

public class ShaktimanAndTheArray {
    public static void main(String[] args) {
        GcdQueries.FastReader scan = new GcdQueries.FastReader();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n;
            n = scan.nextInt();
            int[] arr = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int[] suff = new int[n + 2];
            suff[n + 1] =  arr[n+1];
            for (int i = n; i >= 2; i--) {
                suff[i] = Gcd(arr[i], suff[i + 1]);
            }
            Arrays.sort(suff);
            for (int i = 0; i <= n+1; i++) {
                System.out.println(suff[i]);
            }
            int i=2;
            while (suff[i]==suff[i+1] && i+1<suff.length){
                i++;
            }
            System.out.println(suff[i + 1]);

        }
    }
    private static int Gcd(int a, int b){
        if (a<b){
            int t = a;
            a=b;
            b=t;
        }
        if(b==0){
            return a;
        }
        else{
            return Gcd(b, a%b);
        }
    }
}
