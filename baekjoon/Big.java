package baekjoon;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Big {
	public void big() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=1;
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			int weight = sc.nextInt();
			int height = sc.nextInt();
			arr.add(new Point(weight,height));
		}
		
		for(int i=0;i<num;i++) {
			count=1;
			int w_target = arr.get(i).x;
			int h_target = arr.get(i).y;
			for(int ii=0;ii<num;ii++) {
				if(i==ii) continue;
				if(arr.get(ii).x > w_target && arr.get(ii).y > h_target) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}
}
