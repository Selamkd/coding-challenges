package com.selamkd.june.searchinsert;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] <= target){
                low = mid + 1;

            }else if(nums[mid] >= target){
                high = mid - 1;
            }else{
                return mid;
            }
        }

        return low;
    }
}
