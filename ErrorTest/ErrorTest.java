package ErrorTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ErrorTest {

	public static void main(String[] args) {
		String[][] snap = {
				{"ACCOUNT1","100"},
				{"ACCOUNT2","150"}
		};
		String[][] tran = {
				{"1","SAVE","ACCOUNT2","100"},
				{"2", "WITHDRAW", "ACCOUNT1", "50"},
				{"1", "SAVE", "ACCOUNT2", "100"},
				{"4", "SAVE", "ACCOUNT3", "500"},
				{"3", "WITHDRAW", "ACCOUNT2", "30"}
		};
		solution(snap,tran);
	}
	
	public static String[][] solution(String[][] snapshots, String[][] transactions) {
		 	
		
		String[][] answer = {};
	        String index = "0";
	        HashMap<String,String> map = new HashMap<>();
	        Arrays.sort(transactions,new Comparator<String[]>() {
				@Override
				public int compare(String[] o1, String[] o2) {
					return o1[0].compareTo(o2[0]);
				}
			});
	        
	        for(int i=0;i<snapshots.length;i++) {
	            map.put(snapshots[i][0],snapshots[i][1]);
	        }
	        
	        for(int i=0;i<transactions.length;i++) {
	            if(transactions[i][0].equals(index)) continue;
	            if(!map.containsKey(transactions[i][2])) map.put(transactions[i][2],transactions[i][3]);
	            else {
	                 if(transactions[i][1].equals("SAVE")) {
	                    int value = Integer.parseInt(map.get(transactions[i][2]));
	                    int tmp = Integer.parseInt(transactions[i][3]) + value;
	                    map.remove(transactions[i][2]);
	                    map.put(transactions[i][2],Integer.toString(tmp));
	                } else {
	                	int value = Integer.parseInt(map.get(transactions[i][2]));
	                    int tmp = Integer.parseInt(transactions[i][3]) - value;
	                    map.remove(transactions[i][2]);
	                    map.put(transactions[i][2],Integer.toString(tmp));
	                }
	            }
	            index = transactions[i][0];
	        }
	        
	         List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());
	         Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
	             @Override
	             public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
	                 return o1.getKey().compareTo(o2.getKey());
	             }
	         });
	        
	        answer = new String[map.size()][2];
	        int i=0;
	        for(Iterator<Map.Entry<String, String>> iter = list.iterator(); iter.hasNext();){
	            Entry<String, String> entry = iter.next();
	            answer[i][0] = entry.getKey();
	            answer[i][1] = entry.getValue();
	        }
	        return answer;
	}
	

}
