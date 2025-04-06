class Solution {
    public int solution(int n) {
        int slice = 6;
    
        for(int cnt = 1; ; cnt++ ){
            if((slice * cnt) % n == 0){
                return cnt;
            }
        }
    }
}