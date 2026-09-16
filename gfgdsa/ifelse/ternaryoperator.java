package gfgdsa.ifelse;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n : ");
        int n = sc.nextInt();

        System.out.println((n%2==0)?"even":"odd");

        sc.close();
    }
}
