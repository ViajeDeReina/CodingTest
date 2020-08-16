package bronze.quiz1193;

import java.util.Scanner;

public class Quiz1193 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
	    int i = 1;
	    int j = 1;
	    int sum = 0;
	    int x = Integer.parseInt(scanner.next());
	    
	    while (sum < x)
	    {
	        n++;
	        sum += n;
	    }
	    
	    if (n%2 == 0)
	    {
	        j = sum-x+1;
	        i = n+1-j;
	    }
	    else
	    {
	        i = sum-x+1;
	        j = n+1-i;
	    }
	    
	    System.out.printf("%d/%d", i, j);
	    
	}

}
