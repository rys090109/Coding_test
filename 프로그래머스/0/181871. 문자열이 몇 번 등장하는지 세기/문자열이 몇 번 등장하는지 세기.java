class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            boolean same = true;
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                answer++;
            }
        }
        return answer;
    }
}