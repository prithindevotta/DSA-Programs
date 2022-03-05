package cp.interviewBit;

public class MinStepsInInfiniteGrid {
    public int coverPoints(int[] A, int[] B) {
        int minSteps = 0;
        for(int i=1; i<A.length; i++){
            minSteps += Integer.max(Math.abs(A[i] - A[i-1]), Math.abs(B[i]-B[i-1]));
        }
        return minSteps;
    }
}
