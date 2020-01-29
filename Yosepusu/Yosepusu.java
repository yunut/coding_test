package Yosepusu;

import java.util.*;

public class Yosepusu {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count=1;
        int num = sc.nextInt();
        int trum = sc.nextInt();
        int[] answer = new int[num];
        for(int i=1;i<=num;i++) {
            q.offer(i);
        }
        while(!q.isEmpty()) {
            if(count % trum == 0) {
                count=0;
                arr.add(q.poll());
            } else {
                q.offer(q.poll());
            }
            count++;
        }
        System.out.print("<");
        for(int i=0;i<arr.size()-1;i++) {
            System.out.print(arr.get(i) + ", ");
        }
        System.out.print(arr.get(arr.size()-1) + ">");
	}

}
