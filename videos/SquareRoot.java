package cp.videos;

public class SquareRoot {
    public static int sqrtN(long N) {
        long s = 0;
        long e = N;
        long mid = s + (e-s)/2;
        long ans=-1;
        while(s<=e){
            long sqrt = mid*mid;
            if(sqrt == N){
                return (int)mid;
            }
            else if(sqrt > N){
                e = mid-1;
            }
            else{
                ans = mid;
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return (int)ans;
    }
    public static double precision(int n, int precision, double integer){
        double factor = 1;
        for(int i=0; i<precision; i++){
            factor = factor/10;
            for (double j=integer; j*j <= n; j+=factor){
                integer = j;
            }
        }
        return integer;
    }
    public static void main(String[] args){
        int n = 37;
        int integer_root = sqrtN(n);
        System.out.println(integer_root);
        double b = precision(n, 3, integer_root);
        System.out.printf("%.3f%n", b);
    }
}
