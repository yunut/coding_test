package BestAlbum;

import java.util.*;

public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500,600,150,800,2500};
		
		solution(genres,plays);
	}
	
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String,Integer> mp = new HashMap<>();
        
        //해쉬에 가장 많이 저장된곡 저장
        for(int i=0;i<genres.length;i++) {
            if(!mp.containsKey(genres[i])) {
                mp.put(genres[i],plays[i]);
            } else {
                mp.get(genres[i]);
            }
        }
        return answer;
    }

}


