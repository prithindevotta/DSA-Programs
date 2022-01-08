package cp.videos;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                arr.add(index+1);
            }
            nums[index] = -nums[index];
        }
        return arr;
    }
}
