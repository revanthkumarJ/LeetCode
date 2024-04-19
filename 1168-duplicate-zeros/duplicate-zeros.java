class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> array=new ArrayList<>();
        int n=arr.length;
        for(int i:arr)
        {
            array.add(i);
        }
        int ind=0;
        for(int i:array)
        {
            if(ind>=n)
            break;
            if(i==0)
            {
                arr[ind]=0;
                if(ind+1<n)
                arr[ind+1]=0;
                ind=ind+2;
            }
            else
            {
                arr[ind]=i;
                ind++;
            }
        }
    }
}