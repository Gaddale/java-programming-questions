package com.array.questions;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoAddUpToTargetNumber {
    public static void main(String[] args){
        int[] arr = {2,10,9,10};
        int target = 9;
        int[] result = twoSum(arr, target);

        if(result.length==2){
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }else {
            System.out.println("No Two numbers add up the target");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

