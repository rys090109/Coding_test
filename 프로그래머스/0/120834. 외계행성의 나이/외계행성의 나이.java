class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            answer += (char)(ch - '0' + 'a');
        }
        
        return answer;
    }
}