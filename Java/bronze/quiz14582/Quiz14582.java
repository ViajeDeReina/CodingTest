package bronze.quiz14582;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Quiz14582 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int i = 0;
		int x = 0;
		
		int[] gemini = new int[9];
		StringTokenizer geminis = new StringTokenizer(scn.nextLine());
		while(geminis.hasMoreTokens()) {
			gemini[i] = Integer.parseInt(geminis.nextToken());
			i++;
		}
		int sumGemini = 0;
		
		i = 0;
		
		int[] guliver = new int[9];
		StringTokenizer gulis = new StringTokenizer(scn.nextLine());
		while(gulis.hasMoreTokens()) {
			guliver[i] = Integer.parseInt(gulis.nextToken());
			i++;
		}
		int sumGuliver = 0;
		
		i = 0;
		
		while ((i <9) && (sumGemini <= sumGuliver)) {
			sumGemini += gemini[i];
			if (sumGemini > sumGuliver) {
				x = 1;
				break;
			}
			sumGuliver += guliver[i];
			i++;
		}
		
		if (x == 1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		scn.close();
	}
}
