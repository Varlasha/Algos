/*Задача «a+b^2»*/
import mooc.EdxIO;

public class Solution1 {
    public static void main(String[] args) {
        try (EdxIO io = EdxIO.create()) {
        	long a = io.nextLong();
        	long b = io.nextLong();
            io.println(a + b *b);
        }
    }
}
