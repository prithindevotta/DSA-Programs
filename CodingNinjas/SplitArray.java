package cp.CodingNinjas;

public class SplitArray {
    public static boolean splitArray(int input[]) {
        int sum = 0;
        for(int i=0; i<input.length; i++){
            sum+=input[i];
        }
        if(sum%2 != 0){
            return false;
        }
        return splitArray(input, 0, 0, 0);
    }
    public static boolean splitArray(int input[], int n, int first, int second) {
        if(n == input.length){
            if(first == second){
                return true;
            }
            return false;
        }

        if(input[n] % 5 == 0){
            first+=input[n];
        }
        else if(input[n] % 3 ==0){
            second += input[n];
        }
        else{
            return splitArray(input, n+1, first+input[n], second) || splitArray(input, n+1, first, second+input[n]);
        }
        return splitArray(input, n+1, first, second);
    }
}
