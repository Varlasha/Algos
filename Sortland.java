import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Sortland {
		public static void main(String[] args) throws IOException  {
	    	try (BufferedReader br = new BufferedReader(new FileReader("input.txt")) ;
	    		PrintWriter out = new PrintWriter("output.txt")) {
	    		 int n = Integer.parseInt(br.readLine()); 
	    		 int i ;
	    		 int j;
	    		 int[] number = new int [n];
	    		 for ( i = 0; i < n; ++i) {
	    			 number[i] = i +1;
	    		 }
	    		 double[] M = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	    		 for ( i = 0; i < n; ++i) {
	           		double temp = M[i];
	           		int ind = number[i];
	                for ( j =i-1; j>=0 && M[j] > temp;j--) {
	                    M[j+1]= M[j];
	                    number[j+1]= number[j];
	                }
	                number[j+1]= ind;
	                M[j+1] = temp;
	    		 }
	    		 out.println(number[0] + " " + number[n/2] + " " + number[n-1]); 
	    	}
	}
}
