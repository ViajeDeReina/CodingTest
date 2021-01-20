package bronze.quiz10773;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		
		ArrayList<Integer> numList = new ArrayList();
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			int userinput = Integer.parseInt(buf.readLine());
			if (userinput == 0) {
				sum -= numList.get(numList.size()-1);
				numList.remove(numList.size()-1);
			}
			else {
				numList.add(userinput);
				sum += userinput;
			}
		}
		System.out.println(sum);
	}

}
