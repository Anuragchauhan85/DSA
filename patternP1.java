public class patternP1 {
    public static void main(String args[]) {

        //Star pattern
        // for (int l = 1; l <= 4; l++) {
        //     for (int s = 1; s <= l; s++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //inverted star pattern
        // int n = 4;
        // for (int l = 1; l <= n; l++) {
        //     for (int s = 1; s <= (n - l) + 1; s++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //half pyramid pattern
        // for (int l = 1; l <= 4; l++) {
        //     for (int s = 1; s <= l; s++) {
        //         System.out.print( s );
        //     }
        //     System.out.println();
        // }

        //character pattern
        int n = 4;
        char ch = 'A';
        for (int l = 1; l <= n; l++) {
            for (int s = 1; s <= l; s++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
