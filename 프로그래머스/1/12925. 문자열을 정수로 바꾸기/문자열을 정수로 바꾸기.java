class Solution {
    public int solution(String s) {
        int answer = 0;

        if(s.length() >= 1 && s.length() <= 5 ){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}