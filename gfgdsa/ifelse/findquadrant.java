package gfgdsa.ifelse;

import java.util.Scanner;

public class findquadrant {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("enter x : ");
        int x = sc.nextInt();
        System.out.println("enter y : ");
        int y = sc.nextInt();
 
        if(x==0 && y==0){
            System.out.println("it lies at origin");
        }
        else if(x>0 && y>0){
            System.out.println("it lies in first qudrant");
        }
        else if(x<0 && y>0){
            System.out.println("it lies in Second qudrant");
        }
        else if(x<0 && y<0){
            System.out.println("it lies in third qudrant");
        }
         else if(x>0 && y<0){
            System.out.println("it lies in fourth qudrant");
        }


        sc.close();
    }
}
