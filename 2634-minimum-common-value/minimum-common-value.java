class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a =0,b=0;

        int m = nums1.length,n= nums2.length;

        while(a<m && b<n){
            if(nums1[a]== nums2[b]){
                return nums1[a];
            }
            else if(nums1[a]<nums2[b]){
                a++;
            }
            else{
                b++;
            }
        }

        return -1;
    }
}