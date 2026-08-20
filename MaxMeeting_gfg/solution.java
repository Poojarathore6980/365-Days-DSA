import java.util.*;

class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {

        int n = s.length;

        // [start, finish, original index]
        int[][] meetings = new int[n][3];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = s[i];
            meetings[i][1] = f[i];
            meetings[i][2] = i + 1;
        }

        // Sort by finish time
        // If finish time is same, smaller index first
        Arrays.sort(meetings, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }

            return Integer.compare(a[2], b[2]);
        });

        ArrayList<Integer> ans = new ArrayList<>();

        // Select first meeting
        ans.add(meetings[0][2]);

        int lastFinish = meetings[0][1];

        // Select remaining meetings
        for (int i = 1; i < n; i++) {

            if (meetings[i][0] > lastFinish) {

                ans.add(meetings[i][2]);

                lastFinish = meetings[i][1];
            }
        }

        // Problem asks indices in increasing order
        Collections.sort(ans);

        return ans;
    }
}