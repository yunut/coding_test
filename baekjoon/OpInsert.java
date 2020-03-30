package baekjoon;

import java.util.*;

public class OpInsert {
	
	private static int N;
    private static int[] num;
    private static int[] op;
    private static int max = -2147483648;
    private static int min = 2147483647;
	
	public void opinsert() {
		Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        num = new int[N];
        op = new int[4];
        
        //숫자 입력부
        for(int i=0;i<N;i++) {
            num[i] = sc.nextInt();
        }
        
        //연산자 입력부
        for(int i=0;i<4;i++) {
            op[i] = sc.nextInt();
        }

        dfs(1,num[0]);
        
        System.out.println(max);
        System.out.println(min);
	}
	
	public static void dfs(int count,int answer) {
        if(count == N) {
            if(answer > max) max = answer;
            if(answer < min) min = answer;
            return;
        }
        
        if(op[0] != 0) {
        	int tmp = answer;
            answer += num[count];
            op[0]--;
            dfs(count+1,answer);
            op[0]++;
            answer = tmp;;
        }
        if(op[1] != 0) {
        	int tmp = answer;
            answer -= num[count];
            op[1]--;
            dfs(count+1,answer);
            op[1]++;
            answer = tmp;
        }
        if(op[2] != 0) {
        	int tmp = answer;
            answer *= num[count];
            op[2]--;
            dfs(count+1,answer);
            op[2]++;
            answer = tmp;
        }
        if(op[3] != 0) {
        	int tmp = answer;
        	if(answer < 0) {
        		answer *= -1;
        		answer /= num[count];
        		answer *= -1;
        	} else answer /= num[count];
            op[3]--;
            dfs(count+1,answer);
            op[3]++;
            answer = tmp;
        }
    }
}
