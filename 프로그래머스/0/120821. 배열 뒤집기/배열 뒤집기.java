class Solution {
    public int[] solution(int[] num_list) {
        int a=num_list.length;
        int[] answer = new int[a];
    
         for (int i = 0; i < a; i++) {
            answer[i] = num_list[a - 1 - i];
        }

        return answer;
    }
}