class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        for (int i = 0; i < picture.length; i++) {
            String line = "";
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    line += picture[i].charAt(j);
                }
            }

            for (int j = 0; j < k; j++) {
                answer[index] = line;
                index++;
            }
        }

        return answer;
    }
}