package cp;

import javax.net.ssl.SSLEngineResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GcdQueries {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int t=scan.nextInt();
        while(t-->0){
            int n,q;
            n=scan.nextInt();
            q=scan.nextInt();
            int[] arr=new int[n+2];
            for(int i=1; i<=n; i++){
                arr[i]=scan.nextInt();
            }
            int[] pref = new int[n+2];
            int[] suff = new int[n+2];
            pref[0]=0;//isse pehle ke sare numbers(koi number h hi nahi) ka gcd 0 h.
            pref[1]=arr[1];
            suff[n+1]=0;
            suff[n]=arr[n];
            for(int i=2; i<=n; i++){
                pref[i] = Gcd(arr[i], pref[i-1]);
            }
            for(int i=n-1; i>=1; i--){
                suff[i] = Gcd(arr[i], suff[i+1]);
            }
            for (int i=0; i<q; i++){
                int l = scan.nextInt();
                int r = scan.nextInt();
                int ans = Gcd(pref[l-1], suff[r+1]);
                System.out.println(ans);
            }
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
