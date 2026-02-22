import java.util.Scanner;

public class loops9 {
    public static void main(String args[]) {

        //While loop 
        // int i=0 ;
        // while (i < 100) {
        //     System.out.println("hello world");
        //     i++;
        // }
        // System.out.println("its end");

        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // 

        // Scanner sc = new Scanner(System.in);
        // int i = 1;
        // int n = sc.nextInt();
        // while (i <= n) {
        //     System.out.println(i);
        //     i++;
        // }
        // sc.close();

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("sum is " + sum);
        // sc.close();

        //for loop
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("hello for loop");
        // }

        // for (int i = 1; i <= 4; i++) {
        //     System.out.println("* * * *");
        // }

        //reverese of a number
        // int n = 10899;
        // while (n > 0) {
        //     int l = n % 10;
        //     System.out.print(l);
        //     n = n / 10;
        // }
        // System.out.println();

        //reverse the given number
        // int n = 10899;
        // int rev = 0;
        // while (n>0) {
        //     int l = n % 10;
        //     rev = (rev * 10) + l;
        //     n = n / 10;
        // }
        // System.out.println(rev);

        //do while loop
        // int i = 1;
        // do{
        //     System.out.println("hello do while");
        //     i++;
        // } while (i <= 10);

        //break
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of loop");

        //break question
        // Scanner sc = new Scanner(System.in);
        // do{
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);
        // sc.close();

        //continue
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.println("enter your number : ");
        //     int n = sc.nextInt();
        // if(n%10==0){
        // continue;
        // }
        // System.out.println("number was : "+n);
        // } while (true);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("2 is prime");
        }else{
        boolean isPrime = true;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(n+" is prime");
        } else {
            System.out.println(n+" is not prime");
        }
        sc.close();
         }
    };
};