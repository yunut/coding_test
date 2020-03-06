package ErrorTest;

import java.util.*;

public class ErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(sc.nextLine());
            int num=0;
            String question = sc.nextLine();
            String answer = sc.nextLine();
            
            for(int i=0;i<question.length();i++) {
            	if(question.charAt(i) == answer.charAt(i)) num++;
            }
            System.out.println("#" + test_case + " " + num);

		}
	}
	
	

}
