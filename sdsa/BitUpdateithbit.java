public class BitUpdateithbit {

    public static int setithBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int ClearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updatebit(int n , int i,int newBit) {
        if (newBit == 0) {
            return ClearIthBit(n, i);
        }else{
            return setithBit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(updatebit(10, 2, 1));
    }
}
