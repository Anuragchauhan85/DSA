package gfgdsa.ifelse;

import java.util.Scanner;

public class ternaryinvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n : ");
        int n = sc.nextInt();

        int prasun = (n>=0)? 100 : 0 ;

        System.out.println(prasun);
        sc.close();
    }
}
