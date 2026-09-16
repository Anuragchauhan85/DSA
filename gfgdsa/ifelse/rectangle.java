package gfgdsa.ifelse;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        //check area of rectangel is greater than its perimeter

        Scanner sc = new Scanner(System.in);

        System.out.println("enter length : ");
        int l = sc.nextInt();
        System.out.println("enter breadth : ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l*b);

        if(area>perimeter){
            System.out.println("area of rectangle is greater than its perimeter ");
        }else{
             System.out.println("perimeter of rectangle is greater than its area ");
        }

        sc.close();
    }
}
