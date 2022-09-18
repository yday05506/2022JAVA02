public class squareRoot {
    public long solution(long n) {
        long answer = 0;

        for(long x = 0; x * x <= n; x++) {
            if(x*x == n) answer = (x+1) * (x+1);
            else answer = -1;
        }

        return answer;
    }
}
