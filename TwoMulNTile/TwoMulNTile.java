package TwoMulNTile;

public class TwoMulNTile {
	
	private static int answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		solution(n);
		
	}
	
	public static int solution(int n) {
        answer = 0;
        int[] num = new int[n+1];
        num[1] = 1;
        num[2] = 2;
        
        for(int i=3;i<=n;i++) {
            num[i] = (num[i-1]+num[i-2]) % 1000000007;
        }
        answer = num[n];
        return answer % 1000000007;
    }

}
