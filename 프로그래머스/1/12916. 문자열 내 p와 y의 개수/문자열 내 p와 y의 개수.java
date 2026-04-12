class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
        for(int i=0; i<s.length(); i++){
            char a=s.charAt(i);
            if(a=='P'||a=='p'){
                p++;
            }else if(a=='Y'||a=='y'){
                y++;
            }
        }
        if(p==y){
            answer=true;
        }else{
            answer=false;
        }
        System.out.println(answer);
        return answer;
    }
}