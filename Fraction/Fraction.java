package Fraction;

import java.util.*;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer;
        int head;
        int foot;
        int count=1;
        int tmp=0;
        while(tmp < num) {
            tmp += count;
            count++;
        }
        count--;
        if(count % 2 == 0) {
            head = count;
            foot = 1;
            for(int i=num;i<tmp;i++) {
                head--;
                foot++;
            }
            System.out.println(head + "/" + foot);
        } else {
            head = 1;
            foot = count;
            for(int i=num;i<tmp;i++) {
                head++;
                foot--;
            }
            System.out.println(head + "/" + foot);
        }
	}

}
