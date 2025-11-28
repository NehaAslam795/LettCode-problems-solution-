class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap value -> index
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            // If the needed number already stored, return answer
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        return new int[] {}; // Although problem guarantees a solution
    }
}
