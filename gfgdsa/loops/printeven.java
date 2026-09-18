package gfgdsa.loops;

import java.util.Scanner;

public class printeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
