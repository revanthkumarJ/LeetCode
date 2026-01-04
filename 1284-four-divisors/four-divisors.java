class Solution {
    int currSum=0;
    public int noOfDivisors(int n){
        int res=0;
        currSum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res+=1;
                currSum+=i;
                if(i!=n/i){
                    res++;
                    currSum+=(n/i);
                }
            }
        }
        return res;
    }
    public int sumFourDivisors(int[] nums) {
        int res=0;
        for(int i:nums){
            if(noOfDivisors(i)==4)
            {
                res+=currSum;
            }
        }
        return res;
    }
}