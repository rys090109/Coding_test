class Solution {
    public int[] solution(String myString) {
        int cnt = 0;
        int x = 0;
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x')
                cnt++;
        }
        int[] answer = new int[cnt + 1];
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x')
                x++;
            else
                answer[x]++;
        }
        return answer;
    }
}