package EnglishEnding;

import java.util.*;

public class EnglishEnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		solution(n,words);
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> check = new ArrayList<>();
        int i =1;
        int personNum = 2;
        int answerNum = 1;
        String end = words[0].substring(words[0].length()-1,words[0].length());
        check.add(words[0]);
        for(i=1;i<words.length;i++) {
            if(!(words[i].substring(0,1).equals(end)) || check.contains(words[i])) {
                answer[0] = personNum;
                answer[1] = answerNum;
                break;
            }
            personNum++;
            check.add(words[i]);
            end = words[0].substring(words[i].length()-1,words[i].length());
            if(personNum > n) {
                personNum = 1;
                answerNum++; 
            }
        }
        if(i>words.length) {
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }

}
