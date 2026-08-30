class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char a=myString.charAt(i);
            if(a=='A'){
                answer+="B";
            }else{
                answer+="A";
            }
        }
        if(answer.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}
        
