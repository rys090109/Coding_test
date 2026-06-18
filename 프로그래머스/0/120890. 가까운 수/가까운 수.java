class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0] - n);
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);
            if (diff < min || (diff == min && array[i] < answer)) {
                min = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}