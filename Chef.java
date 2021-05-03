package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chef {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int AM(String S) {
        int min, sec, time;
        if (S.charAt(0) == '1' && S.charAt(1) == '2') {
            min = S.charAt(3) - '0';
            sec = S.charAt(4) - '0';
            time = 10 * min + sec;
        } else {
            int hour1 = S.charAt(0) - '0';
            int hour2 = S.charAt(1) - '0';
            min = S.charAt(3) - '0';
            sec = S.charAt(4) - '0';
            time = hour1 * 1000 + hour2 * 100 + 10 * min + sec;
        }
        return time;
    }

    static int PM(String S) {
        int min, sec, time;
        if (S.charAt(0) == '1' && S.charAt(1) == '2') {
            int hour3 = S.charAt(0) - '0';
            int hour4 = S.charAt(1) - '0';
            min = S.charAt(3) - '0';
            sec = S.charAt(4) - '0';
            time = hour3 * 1000 + hour4 * 100 + 10 * min + sec;
        } else {
            int hour3 = S.charAt(0) - '0';
            int hour4 = S.charAt(1) - '0';
            min = S.charAt(3) - '0';
            sec = S.charAt(4) - '0';
            time = (hour3 + 1) * 1000 + (hour4 + 2) * 100 + 10 * min + sec;
        }
        return time;
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        while (t-- > 0) {
            String chefTime = scan.nextLine();
            int time = 0;
            if (chefTime.charAt(6) == 'A') {
                time = AM(chefTime.split(" ")[0]);
            } else if (chefTime.charAt(6) == 'P') {
                time = PM(chefTime.split(" ")[0]);
            }
            int n = scan.nextInt();
            int[] bool = new int[n];
            for (int i = 0; i < n; i++) {
                String inp = scan.nextLine();
                String startTime = inp.substring(0, 8);
                String endTime = inp.substring(9);
                int sTime = 0, eTime = 0;
                if (startTime.charAt(6) == 'A') {
                    sTime = AM(startTime.split(" ")[0]);
                } else if (startTime.charAt(6) == 'P') {
                    sTime = PM(startTime.split(" ")[0]);
                }
                if (endTime.charAt(6) == 'A') {
                    eTime = AM(endTime.split(" ")[0]);
                } else if (endTime.charAt(6) == 'P') {
                    eTime = PM(endTime.split(" ")[0]);
                }
                if (time >= sTime && time <= eTime) {
                    bool[i] = 1;
                } else {
                    bool[i] = 0;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(bool[i]);
            }
            System.out.println();
        }
    }
}