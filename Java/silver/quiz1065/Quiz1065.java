package silver.quiz1065;

import java.util.Scanner;

public class Quiz1065 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = (int)Integer.parseInt(scanner.next());
		int ttl = 0;
		int num[] = {0,0,0,0};
		
		for (int i=1; i<=n; i++) {
			num[0] = i/1000;
			num[1] = (i%1000)/100;
			num[2] = (i%100)/10;
			num[3] = i%10;
			
			if (num[0] == 1) {
				break;
			}
			else if ((num[0] == 0) && (num[1] == 0)) {
				ttl += 1;
			}
			else {
				if ((num[3]-num[2] == num[2]-num[1])) {
					ttl +=1;
				}
			}
		}
		System.out.println(ttl);		
	}
}