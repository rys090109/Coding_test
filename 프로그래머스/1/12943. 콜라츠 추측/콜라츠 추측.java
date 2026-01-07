class Solution {
    public int solution(int num) {
        int answer = 0;
        long sum=num;
        if(sum==1)
            return 0;
        do{
            if(sum%2==0)sum=sum/2;
            else if(sum%2!=0) sum=sum*3+1;
            answer++;
            
            if(answer>=500){
                return -1;
            }
        }while(sum!=1);
        return answer;
    }
}