class Solution {
    public int solution(int number, int n, int m) {
        
        int num1 = number % n;
        int num2 = number % m;
        
        return num1 == 0 && num2 == 0 ? 1 : 0;
    }
}