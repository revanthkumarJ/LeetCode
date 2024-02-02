class Solution {
    int K;
    String S="";
    public void per(String s,int i,int k)
    {
        if(i==s.length()-1)
        {
            K++;
            if(K==k)
            S=s;
        }
        else if(K!=k)
        {
            char[] array=s.toCharArray();
            for(int j=i;j<s.length();j++)
            {

                char temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                per(new String(array),i+1,k);
            }
        }

    }
    public String getPermutation(int n, int k) {
        StringBuilder r=new StringBuilder("");
        for(int i=1;i<=n;i++)
        {
            r.append(i);
        }
        K=0;
        per(r.toString(),0,k);
        return S;
    }
}