class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dpp = new int[n];
        Arrays.fill(dpp, 1);
        Arrays.sort(nums);
        
        int maxSize = 1, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dpp[i] = Math.max(dpp[i], dpp[j] + 1);
                    if (dpp[i] > maxSize) {
                        maxSize = dpp[i];
                        maxIndex = i;
                    }
                }
            }
        }
        
        List<Integer> res = new ArrayList<>();
        int num = nums[maxIndex];
        for (int i = maxIndex; i >= 0; i--) {
            if (num % nums[i] == 0 && dpp[i] == maxSize) {
                res.add(nums[i]);
                num = nums[i];
                maxSize--;
            }
        }
        
        return res;
    }
}