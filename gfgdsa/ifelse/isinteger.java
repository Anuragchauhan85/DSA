package gfgdsa.ifelse;

import java.util.Scanner;

public class isinteger {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.print("enter a number : ");
        double n = sc.nextDouble();
        int x = (int)n;
        if (n-x>0){
            System.out.print("it is not an integer");
        }else{
            System.out.println("it is an integer");
        }
        sc.close();
    }
}
