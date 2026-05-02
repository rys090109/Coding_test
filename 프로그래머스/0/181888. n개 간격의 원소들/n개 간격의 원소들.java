class Solution {
    public int[] solution(int[] num_list, int n) {
        int a = (num_list.length + n - 1) / n; 
        int[] answer = new int[a];
        
        int b = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[b++] = num_list[i];
        }
        
        return answer;
    }
}