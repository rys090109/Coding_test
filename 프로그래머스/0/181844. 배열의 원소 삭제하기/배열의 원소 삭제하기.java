class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean delete = false;

            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    delete = true;
                    break;
                }
            }

            if (!delete) cnt++;
        }

        int[] answer = new int[cnt];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean delete = false;

            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    delete = true;
                    break;
                }
            }

            if (!delete) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}