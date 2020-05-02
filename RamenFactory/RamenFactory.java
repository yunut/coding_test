package RamenFactory;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RamenFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock = 4;
		int[] dates = {4,10,15};
		int[] supplies = {20,5,10};
		int k = 30;
		solution(stock,dates,supplies,k);
	}
	
	 public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int totalMil=0;
        PriorityQueue<Ramen> ramen = new PriorityQueue<>(dates.length, new Comparator<Ramen>() {
        	@Override
        	public int compare(Ramen o1, Ramen o2) {
        		// TODO Auto-generated method stub
        		return o2.getSupplies() - o1.getSupplies();
        	}
        });
       
        
        int index=0;
        while(true) {
        	if(totalMil + stock >= k) break;
        	
        	for(int i=index;i<supplies.length;i++) 
        	{
        		if(dates[i] <= stock) {
        			ramen.offer(new Ramen(dates[i], supplies[i]));
        			index++;
        		} else break;
        	}
        	stock -= ramen.peek().getDate();
        	totalMil += ramen.peek().getDate();
        	stock += ramen.peek().getSupplies();
        	answer++;
        	
        }
        
        return answer;
    }

}

class Ramen {
	private int index;
    private int date;
    private int supplies;
    
    public Ramen(int date, int supplies) {
    	this.index = index;
        this.date = date;
        this.supplies = supplies;
    }
    
    public int getIndex() {
    	return index;
    }
    
    public int getDate() {
        return date;
    }
    
    public int getSupplies() {
        return supplies;
    }
}
