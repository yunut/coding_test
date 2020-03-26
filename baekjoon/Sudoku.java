package baekjoon;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Sudoku {
	public void sudoku() {
		int[][] map = new int[9][9];
		int tmp;
		ArrayList<Point> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<map.length;i++) {
			for(int ii=0;ii<map[i].length;ii++) {
				tmp=sc.nextInt();
				map[i][ii] = tmp;
				if(tmp == 0) arr.add(new Point(i,ii));
			}
		}
		
		while(arr.size() != 0) {
			boolean[] num_check;
			
			for(int i=0;i<arr.size();i++) {
				num_check = new boolean[10];
				int x = arr.get(i).x;
				int y = arr.get(i).y;
				int count;
				
				//행고정, 열탐색
				count=0;
				for(int ii=0;ii<map.length;ii++) {
					if(map[x][ii] == 0) continue;
					num_check[map[x][ii]] = true;
					count++;
				}
				
				//숫자가 하나만 남아있으면 빈칸을 채우고 0배열을 삭제후 반복
				if(count == 8) {
					for(int ii=1;ii<num_check.length;ii++) {
						if(num_check[ii] == false) {
							map[x][y] = ii;
							arr.remove(i);
							break;
						}
					}
					break;
				}
				
				//열고정, 행탐색
				count=0;
				num_check = new boolean[10];
				for(int ii=0;ii<map.length;ii++) {
					if(map[ii][y] == 0) continue;
					num_check[map[ii][y]] = true;
					count++;
				}
				
				//숫자가 하나만 남아있으면 빈칸을 채우고 0배열을 삭제후 반복
				if(count == 8) {
					for(int ii=1;ii<num_check.length;ii++) {
						if(num_check[ii] == false) {
							map[x][y] = ii;
							arr.remove(i);
							break;
						}
					}
					break;
				}
				
				//3x3맵탐색
				num_check = new boolean[10];
				count=0;
				int x_start = (x / 3) * 3;
				int y_start = (y / 3) * 3;
				
				for(int ii=x_start;ii<x_start+3;ii++) {
					for(int iii=y_start;iii<y_start+3;iii++) {
						if(map[ii][iii] == 0) continue;
						num_check[map[ii][iii]] = true;
						count++;
					}
				}
				if(count == 8) {
					for(int ii=1;ii<num_check.length;ii++) {
						if(num_check[ii] == false) {
							map[x][y] = ii;
							arr.remove(i);
							break;
						}
					}
					break;
				}
				
			}
			
		}
		for(int i=0;i<map.length;i++) {
			for(int ii=0;ii<map[i].length;ii++) {
				System.out.print(map[i][ii] + " ");
			}
			System.out.println();
		}
	}
}
