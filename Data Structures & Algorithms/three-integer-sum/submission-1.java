class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) 
            return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[i] + nums[right] == 0) {
                    res.add(Arrays.asList(
                        nums[left], 
                        nums[i],
                        nums[right]
                    ));
                    left ++;
                    right --;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right --;
                } else {
                    left ++;
                }
            }
        }

        return new ArrayList<>(res);

    }
}
