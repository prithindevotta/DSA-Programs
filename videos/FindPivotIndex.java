package cp.videos;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int total = 0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(sum*2  == total-nums[i]){
                return i;
            }
            sum+=nums[i];
        }
        return -1;

    }
}
