/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }
        
        int index = 1;
        int len = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[index - 1] != nums[index]) {
                len++;
                nums[len - 1] = nums[index];
            }
            index++;
        }
        return len;
    }
}

