package cp;

public class NumberOfJumps {

    static int numberOfJumps(int n){
        if (n == 0){
            return 1;
        }
        if (n<0){
            return 0;
        }

        return numberOfJumps(n-1)+ numberOfJumps(n-2)+numberOfJumps(n-3);
    }

    public static void main(String[] args){
        System.out.println(numberOfJumps(3));
    }
}
