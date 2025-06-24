class Solution {
    public int solution(int[] num_list) {
        int [] a=new int [2];
        int b=1;
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            a[0]+=num_list[i];
            b*=num_list[i];
            
        }
       
        
        if((a[0]*a[0])>b)
            answer=1;
        else
            answer=0;
        return answer;
    }
}