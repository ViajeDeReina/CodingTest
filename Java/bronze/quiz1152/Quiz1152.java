package bronze.quiz1152;

import java.util.Scanner;

public class Quiz1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] sep_str;
		int len;
		
		String str = scanner.nextLine();
		
		if (str.equals(" ")) {
			len = 0;
		}
		else {
			str = str.trim();
			sep_str = str.split(" ");
			
			len = sep_str.length;
		}
		
		System.out.println(len);
	}
}
