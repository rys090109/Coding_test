class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            count[len]++;
        }
        for (int i = 1; i <= 30; i++) {
            if (count[i] > answer) {
                answer = count[i];
            }
        }
        return answer;
    }
}