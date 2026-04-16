public class BitOddorEven {

    public static void oddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(11);
        oddEven(2);
    }
}
