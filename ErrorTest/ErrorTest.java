package ErrorTest;

import java.util.*;

public class ErrorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer=0;
        
        boolean[] isCheck = new boolean[101];
        isCheck[0] = true;
        isCheck[1] = true;
        for(int i=2;i<=isCheck.length/2+1;i++) {
            for(int ii=2;ii<isCheck.length;ii++) {
                if(i==ii || isCheck[ii] == true) continue;
                if(ii % i == 0) isCheck[ii] = true;
            }
        }
        
        for(int i=0;i<num;i++) {
            int tmp = sc.nextInt();
            if(isCheck[tmp] == false) answer++;
        }
        
        System.out.println(answer);
        
	}
	
	

}
