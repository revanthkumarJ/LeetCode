class Solution {
    int dp[][];
    boolean find(int arr[],int i,int curr)
    {
        if(curr==0)return true;
        if(i==0) return arr[0]==curr;
        if(curr<0) return false;
        if(dp[i][curr]!=-1)
        {
            return dp[i][curr]==1;
        }
        dp[i][curr] =(find(arr,i-1,curr-arr[i]) || find(arr,i-1,curr))? 1:0 ;
        return dp[i][curr]==1;
    }

    boolean isSubsetSum(int N, int arr[], int sum){
       dp=new int[N][sum+1];
       for(int a[]:dp)
       {
           Arrays.fill(a,-1);
       }
        return find(arr,N-1,sum);
        
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i:nums)
        {
            s+=i;
        }
        int half=s/2;
        if(half!=(s-half)) return false;
        return isSubsetSum(n, nums,half);
    }
}