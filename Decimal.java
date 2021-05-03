package cp;

import java.math.BigDecimal;
import java.util.Scanner;

public class Decimal {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        String x = scan.nextLine();
        String[] arr = x.split("\\.");
        System.out.println(arr[0]);
    }
}
