import java.util.Scanner;

public class conditionalStatement {
    public static void main(String args[]) {
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("Adult");
        // }
        // if (age > 13 && age < 18) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Not adult");
        // }

        // int A = 1;
        // int B = 3;
        // if (A >= B) {
        //     System.out.println("A id larger in 2");
        // }else{
        //     System.out.println("B id larger in 2");
        // }

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("it is a even Number");
        // }else{
        //     System.out.println("it is a odd Number");
        // }
        // sc.close();

        // int age = 22;
        // if (age >= 18) {
        // System.out.println("Adult");
        // }
        // else if (age > 13 && age < 18) {
        // System.out.println("Teenager");
        // }
        // else {
        // System.out.println("Not adult");
        // }

        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int tax;
        if (Income < 500000) {
             tax = 0;   
        }
        else if (Income >= 500000 && Income < 1000000) {
             tax =(int) (Income * 0.2);   
        }
        else {
             tax =(int) (Income * 0.3);
        }
        System.out.println("Your Amount of tax is :" + tax);
        
        sc.close();
    }
}
