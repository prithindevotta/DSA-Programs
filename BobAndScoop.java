package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BobAndScoop {
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
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> exists = new HashMap<>();
            for (int i =0; i<n; i++){
                arr[i] = scan.nextInt();
                if (exists.containsKey(arr[i])){
                    int a = exists.get(arr[i]);
                    exists.put(arr[i], a+1);
                }
                else {
                    exists.put(arr[i], 1);
                }
            }

            int count=0;
            for (int i=0; i<arr.length; i++){
                int repeat = 0;
                for (int j=arr[i]*2; j<arr[n-1]; j=j+arr[i]){
                    if (exists.containsKey(j)){
                        repeat = repeat+exists.get(j);
                        count = count+exists.get(j);
                    }
                }
                if (exists.get(arr[i])>1){
                    count=count+exists.get(arr[i])-1;
                }
            }
        }
    }
}
