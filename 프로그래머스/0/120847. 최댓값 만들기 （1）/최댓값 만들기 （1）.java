import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int n = numbers.length;
        return numbers[n-1] * numbers[n-2];
    }
}