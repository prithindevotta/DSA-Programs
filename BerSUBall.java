package cp;

import java.util.Arrays;
import java.util.Scanner;
// code forces
// 2 pointer theorem
public class BerSUBall {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] men = new int[n];
        for(int i=0; i<n; i++){
            men[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] women = new int[m];
        for(int i=0; i<m; i++){
            women[i] = scan.nextInt();
        }
        Arrays.sort(men);
        Arrays.sort(women);
        int i=0, j=0, count=0;
        while (i<n && j<m){
            if (men[i] == women[j] || Math.abs(women[j]-men[i])==1){
                i++;
                j++;
                count++;
            }
            else if (men[i]<women[j]){
                i++;
            }
            else {
                j++;
            }
        }
        System.out.println(count);
    }
}
