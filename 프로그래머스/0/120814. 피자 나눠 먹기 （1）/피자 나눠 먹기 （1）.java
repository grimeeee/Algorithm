class Solution {
    public int solution(int n) {
        int piece = 7;
        int pizza = n % piece;
       
        return pizza == 0 ? n / piece : n / piece + 1;
    }
    
}