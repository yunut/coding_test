package primeNumberMade;

import java.util.*;

public class primeNumberMade {
	
	private static int answer;
	private static ArrayList<Integer> arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,7,6,4};
		solution(nums);
	}
	
	public static int solution(int[] nums) {
        answer = 0;
        int target=0;
        
        for(int i=0;i<nums.length;i++) {
            dfs(nums,0,0,i);
        }
        
        arr = new ArrayList<>();
        
        for(int i=2;i<=1500;i++) {
            arr.add(i);
        }
        
        for(int i=2;i<=1500;i++) {
            for(int ii=0;ii<arr.size();ii++) {
                if(arr.get(ii) != i && arr.get(ii) % i == 0) {
                    arr.set(ii,0);
                }
            }
        }
        return answer;
    }
	
	public static void dfs(int[] nums,int sum,int count,int index) {
        if(count == 3) {
        	if(arr.contains(sum)) {
        		answer++;
        	}
            return;
        }
        
        if(index >= nums.length) {
        	return;
        }
        
        sum+=nums[index];
        
        for(int i=index+1;i<=nums.length;i++) {
            dfs(nums,sum,count+1,i);
        }
        
    }

}
