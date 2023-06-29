class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int k = 0;
       
        for(int i =1;i<=n;i++){
            if(i%2==1){
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}