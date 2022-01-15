package cp.videos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Eko {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static long findMaxHeight(ArrayList<Long> arr, long m){
        long s = 0;
        Collections.sort(arr, Collections.reverseOrder());
        long e = arr.get(0);
        long mid = s+(e-s)/2;
        long ans = -1;
        while (s<=e){
            long sum = 0;
            for(long i: arr){
                if(i>mid){
                    sum+=(i-mid);
                }
            }
            if(sum > m){
                ans = mid;
                s = mid+1;
            }
            else if(sum < m){
                e = mid-1;
            }
            else{
                ans = mid;
                break;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long m = scan.nextLong();
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i=0; i<n; i++){
            arrayList.add(scan.nextLong());
        }
        System.out.println(findMaxHeight(arrayList, m));
    }
}
