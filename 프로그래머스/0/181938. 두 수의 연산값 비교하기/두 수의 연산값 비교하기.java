class Solution {
    public int solution(int a, int b) {
        int first = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int second = 2 * a * b;
            
        return first > second ? first : second;
    }
}