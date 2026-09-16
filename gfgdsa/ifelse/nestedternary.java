package gfgdsa.ifelse;

import java.util.Scanner;

public class nestedternary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();


        System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c)+ " is greatest");
        sc.close();
    }

   
}
