package HateTheSameNumber;
import java.util.*;

public class HateTheSameNumber {
	public static void main(String[] args) {
		int[] number = { 1, 3, 3, 4, 5, 1};
		solution(number);
	}
	public static int[] solution(int []arr) {
        ArrayList<Integer> answer_tmp = new ArrayList<>();
	        int i=1;
	        int tmp;
	        tmp = arr[0];
	        answer_tmp.add(arr[0]);
	        while(i < arr.length) {
	        	if(tmp != arr[i]) {
	        		tmp = arr[i];
	        		answer_tmp.add(arr[i]);
	        	}
	        	i++;
	        }
	        
	        int[] answer = new int[answer_tmp.size()];
	        
	        for(i=0;i<answer_tmp.size();i++) {
	            answer[i] = answer_tmp.get(i);
	        }

	        return answer;
	}
}