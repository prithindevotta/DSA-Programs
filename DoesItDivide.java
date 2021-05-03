package cp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DoesItDivide {
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
                catch (IOException e)
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
    public static boolean prime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i*i<=n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            if (n != 1 && prime(n+1)){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }

    }
}
