package Lifeboat;

import java.util.*;

public class Lifeboat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = {70,50,80,50};
		int limit = 100;
		solution(people,limit);
	}
	
	public static int solution(int[] people, int limit) {
		int answer = 0;
        int max=0;
        int count=0;
        int j=0;

        Arrays.sort(people);

        for(int i=people.length-1;i>=j;i--) {
            if(people[i] + people[j] <= limit) {
                answer++;
                j++;
            } else {
                answer++;
            }
        }
        
        return answer;
    }

}
