class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int t = i; t <= j; t++) {
            String temp = Integer.toString(t);
            for (int x = 0; x < temp.length(); x++) {
                if (temp.charAt(x) == (char)('0' + k)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}