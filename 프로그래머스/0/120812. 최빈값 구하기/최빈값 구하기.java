class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int answer = 0;
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            }
        }
        int same = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                same++;
            }
        }
        if (same > 1) {
            return -1;
        }
        return answer;
    }
}