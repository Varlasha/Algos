/*Дан массив целых чисел. Ваша задача — отсортировать его в порядке неубывания с помощью сортировки вставками.
Сортировка вставками проходится по всем элементам массива от меньших индексов к большим («слева направо») для каждого элемента определяет 
его место в предшествующей ему отсортированной части массива и переносит его на это место (возможно, сдвигая некоторые элементы на один индекс вправо). 
Чтобы проконтролировать, что Вы используете именно сортировку вставками, мы попросим Вас для каждого элемента массива, после того, как он будет обработан, 
выводить его новый индекс.*/
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Sort {

    public static void main(String[] args) throws IOException  {
    	try (BufferedReader br = new BufferedReader(new FileReader("input.txt")) ;
    		PrintWriter out = new PrintWriter("output.txt")) {
    		 int n = Integer.parseInt(br.readLine()); 
    		 int i;
    		 int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    		 
    		for (int j = 0 ; j < n ; j++) {
    			i = j - 1 ;
    		 while (i >= 0  && a[i] > a[i+1]) {
    			int temp = a[i];
    			a[i]= a[i+1];
    			a[i+1]=temp;
    			i--;
    		}
       		 out.print((i+2) + " ");
           }
    		out.println( " ");
    		
   		for ( i = 0; i < n; ++i) {
       		 out.print(a[i] + " ");
   		 }
 
    		 
    	}
}
}

