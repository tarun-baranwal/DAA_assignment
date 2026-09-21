import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length + nums2.length];

        int k = 0;

        for (int num : nums1) {
            nums[k++] = num;
        }

        for (int num : nums2) {
            nums[k++] = num;
        }

        Arrays.sort(nums);

        int n = nums.length;

        if (n % 2 == 1) {
            return nums[n / 2];
        }

        return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
    }
}
