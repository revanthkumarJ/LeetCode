class Solution {
    HashMap<Character,Integer> array;
    public void sort(char arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(array.getOrDefault(arr[i],Integer.MAX_VALUE)>array.getOrDefault(arr[j],Integer.MAX_VALUE))
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public String customSortString(String order, String s) {
        array=new HashMap<>();
        int i=1;
        for(char c:order.toCharArray())
        {
            array.put(c,i);
            i++;
        }
        char array[]=s.toCharArray();
        sort(array);
        return new String(array);
    }
}