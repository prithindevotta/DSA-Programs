package cp;

import java.util.Scanner;

public class CoprimeRange {
    static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    static int nextPrime(int N)
    {

        if (N <= 1)
            return 2;

        int prime = N;
        boolean found = false;

        while (!found)
        {
            prime++;

            if (isPrime(prime))
                found = true;
        }

        return prime;
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(nextPrime(b + 1));
        }
    }
}
