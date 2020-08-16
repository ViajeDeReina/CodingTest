package bronze.quiz1085;

import java.io.*;
import java.util.*;

public class Quiz1085 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int a[] = {0,0,0,0};
		int min;
		
		a[0] = x;
	    a[1] = y;
	    a[2] = w-x;
	    a[3] = h-y;
	    
	    min = a[0];
	    for (int i=1; i<4; i++)
	    {
	        if (a[i] < min)
	        {
	            min = a[i];
	        }
	    }
	    
	   System.out.println(min);
	}
}