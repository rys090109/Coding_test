class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();
        java.util.Arrays.sort(arr);
        answer = new String(arr);
        return answer;
    }
}