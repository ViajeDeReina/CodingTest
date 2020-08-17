package bronze.quiz1546;

import java.util.Scanner;

public class Quiz1546 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		String [] sep_score;
		int [] int_scores = new int[n];
		
		String scores = scanner.nextLine();
		sep_score = scores.split(" ");
		
		for (int i = 0; i < n; i++) {
			int_scores[i] = Integer.parseInt(sep_score[i]);
		}

		int max_score = int_scores[0];
		for (int i = 0; i < n; i++) {
			if (int_scores[i] > max_score) {
				max_score = int_scores[i];
			}
		}
		
		double new_sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			double temp = ((double)int_scores[i]/max_score)*100;
			new_sum += temp;
		}
		
		System.out.println(new_sum/n);
	}
}