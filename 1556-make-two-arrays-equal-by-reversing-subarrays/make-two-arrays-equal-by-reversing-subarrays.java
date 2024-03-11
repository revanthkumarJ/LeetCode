class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length!=target.length)
        return false;
        Arrays.sort(arr);
        Arrays.sort(target);
        return Arrays.equals(arr,target);
    }
}