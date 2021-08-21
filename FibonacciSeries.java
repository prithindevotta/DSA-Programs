package cp;

public class FibonacciSeries {

    static int Fibo1(int n){
        if(n==0 || n==1){
            return n;
        }

        return Fibo1(n-1)+Fibo1(n-2);
    }

    static int FiboDp(int n){
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

    static int Fibo3(int n){
        int a = 0;
        int b = 1;
        int c;
        for (int i=2; i<n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args){
        System.out.println(Fibo3(6));
    }
}
