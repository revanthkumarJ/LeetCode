class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++)
        {
            sum=sum+(int)Math.abs(students[i]-seats[i]);
        }
        return sum;
    }
}