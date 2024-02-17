class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> qq=new PriorityQueue<>();
        int used=0;
        for(int i=1;i<heights.length;i++)
        {
            int diff=heights[i]-heights[i-1];
            if(diff>0)
            {
                qq.add(diff);
                if(qq.size()>ladders)
                used=used+qq.remove();
                if(used>bricks)
                return i-1;
            }
        }
        return heights.length-1;
    }
}