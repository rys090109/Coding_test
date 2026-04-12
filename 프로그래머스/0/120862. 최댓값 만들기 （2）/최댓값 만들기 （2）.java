import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int a=numbers.length;
        int case1=numbers[a-1]*numbers[a-2];
        int case2 = numbers[0] * numbers[1];
        answer=Math.max(case1,case2);
        return answer;
    }
}