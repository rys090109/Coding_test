import java.util.Arrays;

class Solution {
public int solution(int[] rank, boolean[] attendance) {
    int answer = 0;
    int[] temp = new int[rank.length];
    int cnt = 0;
    for (int i = 0; i < attendance.length; i++) {
        if (attendance[i] == true) {
            temp[cnt] = i;
            cnt++;
        }
    }
    for (int i = 0; i < cnt - 1; i++) {
        for (int j = i + 1; j < cnt; j++) {
            if (rank[temp[i]] > rank[temp[j]]) {
                int t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
        }
    }
    answer = 10000 * temp[0] + 100 * temp[1] + temp[2];
    return answer;
}

}