package cp;

public class FindTheSafePosition {
    static int safePos(int n, int k) {
        if(n == 1){
            return 1;
        }
        return (safePos(n-1, k) + k-1)%n +1 ;
    }
    public static void main(String[] args){
        System.out.println(safePos(100, 2));
    }
}
