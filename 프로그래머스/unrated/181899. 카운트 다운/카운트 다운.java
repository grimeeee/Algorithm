class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[(start-end)+1];
        int count = start;
        
        for(int i=0; i<=(start-end); i++){
            answer[i] = count;
            count--;
            
        }  
        return answer;
    }
}