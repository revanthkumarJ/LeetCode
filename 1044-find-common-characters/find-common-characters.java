class Solution {
    public List<String> commonChars(String[] words) {
        int arr[]=new int[26];
        for(char c:words[0].toCharArray())
        {
           arr[c-'a']++;
        }

        for(int i=1;i<words.length;i++)
        {
            int array[]=new int[26];
            for(char c:words[i].toCharArray())
            {
                array[c-'a']++;
            }
            for(int j=0;j<26;j++)
            {
                arr[j]=Math.min(arr[j],array[j]);
            }
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(arr[i]>0)
            {
                res.add(((char)(i+'a'))+"");
                arr[i]--;
            }
        }
        return res;

    }
}