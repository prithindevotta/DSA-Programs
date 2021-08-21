package cp;

public class Factorial {

    static int Factorial1(int n){
        if(n == 0){
            return 1;
        }

        return n*Factorial1(n-1);
    }

    public static void main(String[] args){
        System.out.println(Factorial1(5));
    }
}
