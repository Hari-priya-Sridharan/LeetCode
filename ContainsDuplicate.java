class Solution {
    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>(nums.length, 1.0f);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
