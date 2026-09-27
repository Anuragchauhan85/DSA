package gfgdsa.loops;

import java.util.Scanner;

public class compositenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n : ");
        int n= sc.nextInt();
        
        
        boolean Flag = true;

        for( int i=2; i<=n-1; i++){
            if(n%i == 0){
                Flag= false;

                break;
            }
        }
       

        if(n==1)System.out.println("Neither prime nor composite");
        else if(Flag= false) System.out.println("it is a composite number");
        else System.out.println("it is a prime number");

         sc.close();
        
    }
}
