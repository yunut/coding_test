package TheLargestNumber;

import java.util.*;

public class thelargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {3,30,34,5,9};
		solution(number);
	}
	
	 static String solution(int[] numbers) {
	       String answer = "";
		        
		        //��ģ ���ڿ��� ���ϱ����� String �迭 ����
		        String[] number_tmp = new String[numbers.length];
		        
		        //int�� �迭�� String�迭�� ����
		        for(int i=0;i<numbers.length;i++) {
		            number_tmp[i] = String.valueOf(numbers[i]);
		        }
		        
		        
		        Arrays.sort(number_tmp, new Comparator<String>() {
		            @Override
		            public int compare(String o1, String o2) {
		                return (o2+o1).compareTo(o1+o2);
		            }
		        });
		        if(number_tmp[0].equals("0")) {
	                answer += "0";
	            } else {
	                for(int i=0;i<number_tmp.length;i++) {
	                    answer += number_tmp[i];
	                }
	            }
		        
		        return answer;
	 }

}
