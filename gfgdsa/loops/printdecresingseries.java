package gfgdsa.loops;
//print series 99,95,91,87,83.... upto positive numbers
public class printdecresingseries {
    public static void main(String[] args) {
        int j=99;
        for( int i=j;j>=0; j-=4){
            System.out.println(i);
        }
    }
}
