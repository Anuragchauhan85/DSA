package gfgdsa.ifelse;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("apurva");
        } else if (n % 5 == 0) {
            System.out.println("riya");
        } else if (n % 3 == 0) {
            System.out.println("bhanu");
        } else {
            System.out.println("Isha");
        }
        sc.close();
    }
}
