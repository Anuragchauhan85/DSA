package gfgdsa.loops;

import java.util.Scanner;
//airthmetic progression for n times
public class apntimes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();
        // for( int i=2; i<=3*n-1; i+=3){
        //     System.err.println(i);
        // }
        int a=2 ; int d=3;
        for(int i=1; i<=n; i++){
            System.err.println(a);
            a +=d;
        }
        sc.close();
    }
}
