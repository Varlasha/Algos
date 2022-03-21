import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class SwapSecretary {
	public static void main(String[] args) throws IOException  {
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt")) ;
	    		PrintWriter out = new PrintWriter("output.txt")) {
	    		 int n = Integer.parseInt(br.readLine()); 
	    		 int[] M = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    		 int i= 0;
	    		 int j;
	    		 for ( i = 0; i < n; ++i) {
		           		int temp = M[i];
		           		int number = i+1;
		                for ( j =i-1; j>=0 && M[j] > temp;j--) {
		                    M[j+1]= M[j];
		                }
		                M[j+1] = temp;
		               if ((j+2) != number) {
		                out.println("Swap elements at indices " + (j+2) + " and " + (i+1) + ".");
		                }
		                }
	    		 
	             out.println("No more swaps needed.");
	    		 for ( i = 0; i < n; ++i) {
	           		 out.print(M[i] + " ");
	       		 }
	    	}
	}

}
