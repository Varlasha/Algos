import mooc.EdxIO;

public class Solution {
    public static void main(String[] args) {
        try (EdxIO io = EdxIO.create()) {
            io.println(io.nextInt() + io.nextInt());
            System.out.println((Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/1024/1024);
        }
    }
}