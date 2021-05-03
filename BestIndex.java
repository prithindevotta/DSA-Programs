package cp;

import java.util.Scanner;

public class BestIndex {
    static void BestInd(Long[] arr) {
        Long maxsum = 0L;
        for (int i = 0; i < arr.length-2; i++) {
            int turn=1;
            int sum = turn*(turn+1)/2;
            while(sum<=((arr.length)-i)){
                turn++;
                sum = turn*(turn+1)/2;
            }
            turn--;
            sum = turn*(turn+1)/2;
            Long tSum=0L;
            for(int j=i; j<i+sum; j++){
                tSum = tSum+arr[j];
            }
            if(tSum>maxsum){
                maxsum = tSum;
            }
        }
        if(arr[arr.length-2]> maxsum){
            maxsum = arr[arr.length-2];
        }
        else if(arr[arr.length-1]> maxsum){
            maxsum = arr[arr.length-1];
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Long[] arr = new Long[n];
        for(int i=0; i<n; i++){
            arr[i]=scan.nextLong();
        }
        BestInd(arr);

    }
}
