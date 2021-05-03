package cp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class PalpalString {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            String a = scan.next();
            char[] b=a.toCharArray();
            Arrays.sort(b);
            if(a.length()==1){
                System.out.println("YES");
            }
            else {
                int i=0,k=1;
                LinkedList<Integer> arr = new <Integer>LinkedList();
                arr.add(k);
                while (i<a.length()-1){
                    if(b[i]==b[i+1]){
                        int last = arr.getLast();
                        arr.removeLast();
                        arr.add(last+1);
                    }
                    else {
                        arr.add(1);
                    }
                    i++;
                }
                int flag2=0;
                while (arr.contains(1)){
                    int flag =0;
                    for (int l=0; l<arr.size(); l++){
                        if (arr.get(l)%2==0){
                            arr.remove(arr.indexOf(1));
                            arr.remove(l);
                            flag=1;
                            break;
                        }
                    }
                    if (flag==0){
                        System.out.println("NO");
                        flag2=1;
                        break;
                    }
                }
                if (flag2==0){
                    System.out.println("YES");
                }
            }
        }
    }
}
