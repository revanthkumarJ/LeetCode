class Solution {
    public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
        xor ^= num;
    }
    
    int rev = 1;
    while ((xor & rev) == 0) {
        rev <<= 1;
    }
    
    int n1 = 0;
    int n2 = 0;
    
    for (int i : nums) {
        if ((i & rev) == 0) {
            n1 ^= i;
        } else {
            n2 ^= i;
        }
    }
    
    return new int[]{n1, n2};
}
}