import java.util.Scanner;

public class conditionalStatement8 {
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

          //    Scanner sc = new Scanner(System.in);
          //    int Income = sc.nextInt();
          //    int tax;
          //    if (Income < 500000) {
          //         tax = 0;   
          //    }
          //    else if (Income >= 500000 && Income < 1000000) {
          //         tax =(int) (Income * 0.2);   
          //    }
          //    else {
          //         tax =(int) (Income * 0.3);
          //    }
          //    System.out.println("Your Amount of tax is :" + tax);

          //    sc.close();

          // int A = 1,B = 3, C = 6;
          // if ((A > B) && (A > C)) {
          //      System.out.println("A is greater ");
          // }
          // else if (B > C) {
          //      System.out.println("B is greater");
          // }
          // else {
          //      System.out.println("C is greater");
          // }

          //ternary operator
          // int num = 4;
          // String type = ((num % 2) == 0) ? "even" : "odd";
          // System.out.println(type);

          // Scanner sc = new Scanner(System.in);
          // int marks = sc.nextInt();
          // String result = (marks >= 33) ? "Pass" : "Fail";
          // System.out.println(result);
          // sc.close();

          //Switch
          // int num = 2;
          // switch (num) {
          //      case 3:
          //           System.out.println("Samosa");
          //           break;
          //      case 1:
          //           System.out.println("Burger");
          //           break;
          //      case 2:
          //           System.out.println("Mangoshake");
          //           break; 
          //      default:
          //           System.out.println("we wakeup");
          //           break;
          // }

          Scanner sc = new Scanner(System.in);
          System.out.println("enter a : ");
          int a = sc.nextInt();
          System.out.println("enter operator : ");
          char operator = sc.next().charAt(0);
          System.out.println("enter b : ");
          int b = sc.nextInt();

          switch (operator) {
               case '+':
                    System.out.println("Ans : "+(a + b));
                    break;
               case '-':
                    System.out.println("Ans : " + (a - b));
                    break;
               case '*':
                    System.out.println("Ans : " + (a * b));
                    break;
               case '/':
                    System.out.println("Ans : " + (a / b));
                    break;
               case '%':
                    System.out.println("Ans : " + (a % b));
                    break;
               default:
                    System.out.println("wrong operator");
                    break;
          }
          sc.close();
     }
}
