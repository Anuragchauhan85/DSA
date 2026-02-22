import java.util.Scanner;

public class function11 {
    // public static void Printhelloworld() {
    //     System.out.println("hello world");
    // }

    // public static int calculatesum(int a, int b ) {
    //     int sum = a + b;
    //     return sum;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculatesum(a, b);
    //     System.out.println("sum is : " + sum);
    //     sc.close();
    // }

    //swap
    // public static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;

    // }

    // public static void main(String args[]) {
    //     int a = 5;
    //     int b = 10;
    //     swap(a, b);
    //     System.out.println("a = " + a);
    //     System.out.println("b = " + b);
    // }

    //prod of a*b
    // public static int multiply(int a, int b) {
    //     int mul = a * b;
    //     return mul;
    // }
    // public static void main(String args[]) {
    //     int a = 3;
    //     int b = 5;
    //     int prod = multiply(a, b);
    //     System.out.println(prod);
    // }

    //factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    
    // public static void main(String args[]) {
    //     System.out.println(factorial(4));
    //}

    // binomial coefficieat
    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
    public static void main(String args[]) {
        System.out.println(bincoeff(5,2));
    }

}
