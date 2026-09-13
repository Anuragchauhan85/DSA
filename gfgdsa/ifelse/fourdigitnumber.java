package gfgdsa.ifelse;

import java.util.Scanner;

public class fourdigitnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        if (n>999&&n<10000){
            System.out.println("it is the four digit number");
        }else{
            System.out.println("it is not a four digit number");
        }
        sc.close();
    }
}
