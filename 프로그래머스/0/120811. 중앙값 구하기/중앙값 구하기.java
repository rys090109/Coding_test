import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt=0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            cnt++;
        }
        answer+=array[cnt/2];
        return answer;
    }
}