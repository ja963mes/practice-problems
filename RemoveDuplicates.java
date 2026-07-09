class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int position = 1; // nums[0] is always unique, keep it

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[position - 1]) {
                nums[position] = nums[i];
                position++;
            }
        }

        return position;
    }
}