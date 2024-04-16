class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> array=new Stack<>();
        int i=0,j=0;
        int n=pushed.length;
        while(i<n && j<n)
        {
            if(pushed[i]==popped[j])
            {
                i++;
                j++;
            }
            else if(!array.isEmpty() && popped[j]==array.peek())
            {
                j++;
                array.pop();
            }
            else
            {
                array.push(pushed[i++]);
            }
        }
        while(j<n)
        {
            if(array.peek()==popped[j])
            {
                j++;
                array.pop();
            }
            else
            break;
        }
        return array.isEmpty();
    }
}