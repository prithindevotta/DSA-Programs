package cp;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }

        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int t=i+1;
        for (int k=nums.length-1; k>t; k--){
            int temp_2=nums[t];
            nums[t]=nums[k];
            nums[k]=temp_2;
            t++;
        }
        for(int num: nums){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
    }
}
