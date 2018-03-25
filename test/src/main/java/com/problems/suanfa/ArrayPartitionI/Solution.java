package com.mianshi.suanfa.ArrayPartitionI;

/**
 * Created by macbook_xu on 2018/3/25.
 */
public class Solution {
    public static int arrayPairSum(int[] nums) {
        for (int i = 0 ; i<nums.length ; i++){
            for (int j = i+1 ; j<nums.length ; j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int count = 0;
        for (int i = 0 ; i<nums.length ; i+=2){
            count += nums[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}
