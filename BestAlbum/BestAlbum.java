package BestAlbum;

import java.util.*;
import java.util.Map.Entry;

public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500,600,150,800,2500};
		
		solution(genres,plays);
	}
	
	public static int[] solution(String[] genres, int[] plays) {
		HashMap<String,Integer> map = new HashMap<>();
        Music[] music = new Music[genres.length];
        int[] answer;
        
        //수록된 곡의 총 재생된 횟수를 구해 해쉬에 저장
        for(int i=0;i<genres.length;i++) {
        	music[i] = new Music(i,genres[i],plays[i]);
            if(!map.containsKey(genres[i])) map.put(genres[i],plays[i]);
            else {
            	int value = map.get(genres[i]);
            	map.remove(genres[i]);
                map.put(genres[i],value+plays[i]);
            }
        }
        
        List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
        
        Collections.sort(list,new Comparator<Entry<String,Integer>>() {
        	@Override
        	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        		return o2.getValue().compareTo(o1.getValue());
        	}
		});
        
        Arrays.sort(music,new Comparator<Music>() {
        	@Override
        	public int compare(Music o1, Music o2) {
        		// TODO Auto-generated method stub
        		return o2.getPlays() - o1.getPlays();
        	}
		});
        
       //각 장르별 가장 많이 재생한 곡 2곡을 list에 삽입
        ArrayList<Integer> arr = new ArrayList<>();
        int hashIndex=0;
        while(hashIndex < map.size()) {
        	int count=0;
            String musicName = list.get(hashIndex).getKey();
            for(int i=0;i<music.length;i++) {
            	if(count == 2) break;
            	if(musicName.equals(music[i].getGenres()))  {
            		arr.add(music[i].getIndex());
            		count++;
            	}
            }
            hashIndex++;
        }
        
        answer = new int[arr.size()];
        for(int i=0;i<answer.length;i++) {
        	answer[i] = arr.get(i);
        	System.out.print(answer[i]+" ");
        }
        
        return answer;
    }

}

//장르의 최대 플레이 인덱스를 파악할 클래스
class Music {
    private int index;
	private String genres;
	private int plays;
	
	public Music(int index, String genres,int plays) {
		this.index = index;
      this.genres = genres;
		this.plays = plays;
	}
  
  public int getIndex() {
      return index;
  }
  
  public void setIndex(int index) {
      this.index = index;
  }
	
	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public int getPlays() {
		return plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}
	
	
}