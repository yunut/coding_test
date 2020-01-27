package NumberReverse;

import java.util.*;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1000000000;
		solution(n);
	}
	
	 public static int[] solution(long n) {
		  int[] answer;
	      String tmp = Long.toString(n);
	      String[] arr = tmp.split("");
	      Arrays.sort(arr, new Comparator<String>() {
	          @Override
	          public int compare(String o1, String o2){
	              return -1;
	          }
	      });
	      answer = new int[arr.length];
	      for(int i=arr.length-1;i>=0;i--){
	          answer[i] = Integer.parseInt(arr[i]);
	      }
	      return answer;
	  }

}
