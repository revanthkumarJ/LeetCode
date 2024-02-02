class Solution {
    public String concat(String s,int n)
    {
        StringBuilder r=new StringBuilder(s);
        for(int i=2;i<=n;i++)
        {
            r.append(s);
        }
        return r.toString();

    }
    public String decodeString(String s) {
        int left=0,right=0,l=-1,r=0;
        int n=s.length();
        do{
            l=-1;
            left=0;
            right=0;
            int num=0;
            int numStart=-1;
            for(int i=0;i<s.length();i++)
            {
                char d=s.charAt(i);
                if(d=='[')
                {
                    if(l==-1)
                    l=i;
                    left++;
                }
                else if(d==']')
                {
                    right++;
                    if(left==right)
                    {
                        r=i;
                        break;
                    }
                }
                else if(d>='0' && d<='9')
                {
                    if(numStart==-1)
                    numStart=i;
                    if(l==-1)
                        num=num*10+(d-'0');
                } 
            }
            if(l==-1)
            break;
            if(r+1<s.length())
            s=s.substring(0,numStart)+concat(s.substring(l+1,r),num)+s.substring(r+1);
            else
            s=s.substring(0,numStart)+concat(s.substring(l+1,r),num);
        }while(l!=-1);
        return s;
    }
}