/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int curr_end = Integer.MIN_VALUE;
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        for (Interval iv : intervals) {
            if (iv.start < curr_end) return false;
            curr_end = Math.max(curr_end, iv.end);
        }
        return true;
    }
}
