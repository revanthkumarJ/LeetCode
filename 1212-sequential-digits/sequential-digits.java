class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String r="123456789";
        int l=(low+"").length();
        int h=(high+"").length();
        List<Integer> array=new ArrayList<>();
        while(l<=h)
        {
            for(int i=0;i<=9-l;i++)
            {
                int num=Integer.parseInt(r.substring(i,i+l));
                if(num<low)
                continue;
                if(num>high)
                {
                    l++;
                    break;
                }
                array.add(num);
            }
            l++;
        }
        return array;
    }
}