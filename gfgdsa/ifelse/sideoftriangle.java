package gfgdsa.ifelse;

import java.util.Scanner;

public class sideoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your first side : ");
        int a =sc.nextInt();
        System.out.println("enter your Second side : ");
        int b = sc.nextInt();
        System.out.println("enter your third side : ");
        int c = sc.nextInt();

        if (a+b>c && a+c>b && b+c>a){
            System.out.println("it is sides of a triangle ");
        }else{
            System.out.println("it is not sides of triangle");
        }
    }
}
