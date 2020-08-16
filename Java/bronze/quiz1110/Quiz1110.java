package bronze.quiz1110;

import java.util.Scanner;

public class Quiz1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int n = Integer.parseInt(scanner.next());
		int new_num = 0;
		
		int c = a + b;
		int cnt = 0;
		
		if (n == 0) {
			cnt = 1;
		}
		
		while (new_num != n) {
			
			if (cnt == 0) {
				new_num = n;
			}

			if (new_num <10) {
				a = 0;
				b = new_num;
			}
			else {
				a = new_num/10;
				b = new_num%10;
			}
		    c = a + b;
		    new_num = (10*b) + (c%10);
		    
		    cnt +=1;
		}
		
		System.out.println(cnt);
	}
}