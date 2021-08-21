package cp;

public class FastExponentiation {

    static int exp(int n){

        if (n == 0){
            return 1;
        }

        int num = exp(n/2);

        if ((n&1) == 1){
            return 2*num*num;
        }
        else {
            return num*num;
        }
    }

    public static void main(String[] args){
        System.out.println(exp(5));
    }
}
