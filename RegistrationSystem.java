package cp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//4C codeforces
public class RegistrationSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Map<String, Integer> db = new HashMap<>();
        while(t-- >0){
            String a = scan.next();
            if(db.containsKey(a)){
               int suf = db.get(a);
               suf++;
               db.put(a, suf);
               System.out.println(a+suf);
            }
            else {
                db.put(a, 0);
                System.out.println("OK");
            }
        }
    }
}
