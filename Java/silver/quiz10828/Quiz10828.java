package bronze.quiz10828;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Quiz10828 {

	public static void main(String[] args) throws Exception {
		// STACK!

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> stack = new ArrayList();
		
		int n = Integer.parseInt(buf.readLine());
		
		for (int i=0; i<n; i++) {
			String command = buf.readLine();
			int a = 0;
			if (command.length() > 5) {
				a = Integer.parseInt(command.substring(5));
				command = command.substring(0,4);
			}
			
			switch(command) {
				case "push":
					stack.add(a);
					break;
				case "pop":
					if (stack.size()!= 0) {
						System.out.println(stack.get(stack.size()-1));
						stack.remove(stack.size()-1);
					}
					else {
						System.out.println(-1);
					}
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if (stack.size() == 0) {
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
					break;
				case "top":
					if (stack.size()!= 0) {
						System.out.println(stack.get(stack.size()-1));
					}
					else {
						System.out.println(-1);
					}
					break;
			}
		}
	}
}
