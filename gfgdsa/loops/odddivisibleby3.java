package gfgdsa.loops;

//print odd number 1 to 100 divisible by 3
public class odddivisibleby3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
