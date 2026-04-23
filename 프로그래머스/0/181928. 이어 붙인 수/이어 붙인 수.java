class Solution {
    public int solution(int[] num_list) {
        int ghf = 0;  
        int Wkr = 0;  
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                ghf = ghf * 10 + num_list[i];
            } else {
                Wkr = Wkr * 10 + num_list[i];
            }
        }
        
        return ghf + Wkr;
    }
}