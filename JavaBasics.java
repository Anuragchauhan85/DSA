import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // int a = 2;
        // int b = 8;
        // System.out.println(a+b);

        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int Product = a * b;
        // System.out.println(Product);

        float r = sc.nextFloat();
        float Area = 3.14f * r * r;
        System.out.println(Area);

        sc.close();
   }
}
