package cp.interviewBit;

public class PickFromBothSides {
    public int solve(int[] A, int B) {
        if(B>A.length){
            return 0;
        }
        int[] lSum = new int[B+1], rSum = new int[B+1];
        lSum[0] = 0;
        rSum[0] = 0;
        for(int i=0; i<B; i++){
            lSum[i+1] = lSum[i]+A[i];
        }
        for(int i=A.length-1; i>=A.length-B; i--){
            rSum[A.length - i] = rSum[A.length-1 - i]+A[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<lSum.length; i++){
            int temp = lSum[i] + rSum[rSum.length-1 - i];
            if(temp > maxSum){
                maxSum = temp;
            }
        }
        return maxSum;
    }
}
