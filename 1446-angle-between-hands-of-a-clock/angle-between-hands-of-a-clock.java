class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = (hour*30)+(minutes*0.5);
        double minutesAngle = minutes*6;

        double ans =  Math.abs(hourAngle - minutesAngle);

        return Math.min(ans,360-ans);
    }
}