import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uni = new HashSet<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (uni.add(nums[i])) {
                nums[index++] = nums[i];
            }
        }
        return index;

    }

}