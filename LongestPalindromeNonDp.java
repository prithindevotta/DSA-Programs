package cp;

public class LongestPalindromeNonDp {

    static String longestPalin(String S){
        int n = S.length();
        int start = 0;
        int maxLen = 1;
        for (int i=1; i<n; i++){
            //handle even cases
            int low = i-1;
            int high = i;
            while (low>=0 && high<n && S.charAt(low) == S.charAt(high)){
                if (high-low+1>maxLen){
                    start = low;
                    maxLen = high-low+1;
                }
                high++;
                low--;
            }
            //handle odd cases
            low = i-1;
            high = i+1;
            while (low>=0 && high<n && S.charAt(low) == S.charAt(high)){
                if (high-low+1 > maxLen){
                    start = low;
                    maxLen = high-low+1;
                }
                high++;
                low--;
            }
        }
        return S.substring(start, start+maxLen);
    }

    public static void main(String[] args){
        System.out.println(longestPalin("bhnjirdanabcdcbanavjknrewflb"));
    }
}
