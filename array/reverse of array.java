import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
		    int n = sc.nextInt();
		    int ar[] = new int[n];
		    
		    int a = 0; 
		    int b = (n - 1);
		    for(int j = 0; j < n; j++)
		    {
		        ar[j] = sc.nextInt();
		    } 
		    
		    while(a < b)
		    {
		        int c;
		        c = ar[a];
		        ar[a] = ar[b];
		        ar[b] = c;
		        
		        a++;
		        b--;
		    
		        
		    }
		    for(int k = 0; k < n; k++)
		    {
		        System.out.print(ar[k] + " ");
		    }
		    
		    
		    
		 
		}
		
	}
}
