package cp;

import java.util.Scanner;

public class MatrixXOR {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            long k = scan.nextLong();
            if (n==2 || m==2){
                long last = k+n+m;
                long first = k+2;
                System.out.println(last ^ first);
            }
            else if (n==m){
                long last = k+n+m;
                long first = k+2;
                long middle = 1+m+k;
                System.out.println(last^first^middle);
            }
            else if (n%2 != 0 && n>2 && n<m){
                long last = k+n+m;
                long first = k+2;
                long sum = 0;
                for (int i=n+1; i<=m+1; i++){
                    sum=sum^(i+k);
                }
                System.out.println(last^first^sum);
            }
            else if (m%2 != 0 && m>2 && m<n){
                long last = k+n+m;
                long first = k+2;
                long sum = 0;
                for (int i=m+1; i<=n+1; i++){
                    sum=sum^(i+k);
                }
                System.out.println(last^first^sum);
            }
            else if (n>2 && n<m){
                long last = k+n+m;
                long first = k+2;
                long sum = ((m-n+1)+1+k)^((m-n+1)+m+k);
                System.out.println(last^first^sum);
            }
            else if (m>2 && m<n){
                long last = k+n+m;
                long first = k+2;
                long sum = ((n-m+1)+1+k)^((n-m+1)+n+k);
                System.out.println(last^first^sum);
            }
            if (n==1){
                long sum=0;
                for (int i=2; i<2+m; i++){
                    sum = sum^(k+i);
                }
                System.out.println(sum);
            }
            if (m==1){
                long sum=0;
                for (int i=2; i<2+n; i++){
                    sum = sum^(k+i);
                }
                System.out.println(sum);
            }
        }
    }
}
