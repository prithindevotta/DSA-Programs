package cp;
import java.util.Scanner;

public class toffeeProb {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test, type, min;
        test = scan.nextInt();
        for(int i=0; i<test; i++){
            int count = 0;
            type = scan.nextInt();
            min = scan.nextInt();
            for(int j=0; j<type; j++){
                int in = scan.nextInt();
                in = in/min;
                count = count + in;
            }
            System.out.println(count);
        }
    }
}
