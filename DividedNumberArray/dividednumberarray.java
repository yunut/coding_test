package DividedNumberArray;

import java.util.ArrayList;
import java.util.Collections;

public class dividednumberarray {
	public static void main(String[] args) {
		int[] number = {5,9,7,10};
		int divisor = 5;
		solution(number,divisor);
	}
	public static int[] solution(int[] arr, int divisor) {
		int[] answer;
	      ArrayList<Integer> tmp = new ArrayList<>();
	      for(int i=0;i<arr.length;i++) {
	          if(arr[i] % divisor == 0) {
	              tmp.add(arr[i]);
	          }
	      }
	      Collections.sort(tmp);
	      
	      if(tmp.size() == 0) {
	          answer = new int[1];
	          answer[0] = -1;
	      } else {
	         answer = new int[tmp.size()];
	         for(int i=0;i<tmp.size();i++) {
	            answer[i] = tmp.get(i);
	         };
	      }
	      
	      return answer;
	}
}
