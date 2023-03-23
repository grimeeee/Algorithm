class Solution {
    public double solution(int[] numbers) {
        //float vs double
        double sum = 0;
        for(int i=0; i< numbers.length; i++){
           sum = sum + numbers[i];
        }
        
        return sum / numbers.length;
    }
}