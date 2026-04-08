public class StringGetshotestPath {

    public static float ShortPath (String Path) {
        int x = 0, y = 0;

        for (int i = 0; i < Path.length(); i++) {
            char dir = Path.charAt(i);
            if (dir == 'S') {
                y--;
            }
            else if (dir == 'N') {
                y++;
            }
            else if (dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return(float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(ShortPath(Path));


        //to compare two strings
        String s1 = "abc";
        String s2 = new String("abc");

        if (s1.equals(s2)) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }

        if (s1==s2) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }
    }
}


