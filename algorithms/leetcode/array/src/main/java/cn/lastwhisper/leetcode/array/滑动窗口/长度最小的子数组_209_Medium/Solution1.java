package cn.lastwhisper.leetcode.array.滑动窗口.长度最小的子数组_209_Medium;

/**
 * @author lastwhisper
 */
public class Solution1 {
    /**
     * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
     * 暴力解法
     * 时间复杂度：O(n^3)
     * 空间复杂度：O(1)
     */
    public int minSubArrayLen(int s, int[] nums) {
        if (s <= 0 || nums == null) {
            throw new IllegalArgumentException("Illegal Argument");
        }
        int res = nums.length + 1;
        for (int l = 0; l < nums.length; l++) {
            for (int r = l; r < nums.length; r++) {
                int sum = 0;
                // 求[l...r]子数组之和
                for (int i = l; i < r; i++) {
                    sum += nums[i];
                }
                if (sum >= s) {
                    res = Math.min(res, r - l + 1);
                }
            }
        }
        if (res == nums.length + 1) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        System.out.println((new Solution1()).minSubArrayLen(s, nums));
    }
}
