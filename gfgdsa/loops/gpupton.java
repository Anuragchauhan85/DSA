package gfgdsa.loops;

import java.util.Scanner;

public class gpupton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n : ");
        int n = sc.nextInt();

        // display gp 1,3,4,8,16 upto n terms
        // int a=1 , r=2;
        // for(int i=1 ; i<=n; i++){
        // System.out.println(a);
        // a *=r;
        // }

        for (int i = 0; i <= n; i++) {
            System.out.println(i + 1);
            System.out.println(n - i);
        }

    }
}