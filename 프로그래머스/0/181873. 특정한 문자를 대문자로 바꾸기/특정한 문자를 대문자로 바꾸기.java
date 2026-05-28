class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(a == alp.charAt(0)) {
                a = Character.toUpperCase(a);
            }
            answer += a;
        }
        return answer;
    }
}