package com.selamkd.May;

public class ClosestToZero {
    public static int closestToZero(int[] nums) {
        int closest = nums[0];

        if(nums.length <= 1){
            throw new IllegalArgumentException();
        }
        for(int num : nums){
            int absNum = Math.abs(num);
            int absClosest = Math.abs(closest);
            if(absNum < absClosest || (absNum == absClosest && num > closest)){
                closest = num;
            }
        }
        return closest;
    }
}
