package cp;

public class LongestPalindrome {
    static String longestPalin(String S){
        int maxLen = 1;
        int n = S.length();
        Boolean[][] t = new Boolean[n][n];

        for(int i=0; i<n; i++){ //single letters are always palindrome (odd cases covered)
            t[i][i] = true;
        }
        int start = 0;
        for (int i=0; i<n-1; i++){// even cases covered
            if (S.charAt(i) == S.charAt(i+1)){
                t[i][i+1] = true;
                start = i;
                maxLen = 2;
            }
            else{
                t[i][i+1] = false;
            }
        }
        for (int k=3; k<=n; k++){
            for (int i=0; i<=n-k; i++){
                int j = i+k-1;

                if (t[i + 1][j - 1] && S.charAt(i)==S.charAt(j)){
                    t[i][j] = true;
                    if (k>maxLen){
                        start = i;
                        maxLen = k;
                    }
                }
                else{
                    t[i][j] = false;
                }
            }
        }
        return S.substring(start, start+maxLen);
    }
    public static void main(String[] args){
        System.out.println(longestPalin("abcdcba"));
    }
}
