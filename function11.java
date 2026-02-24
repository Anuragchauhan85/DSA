// import java.util.Scanner;

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
    // public static int factorial(int n) {
    //     int f = 1;
    //     for (int i = 1; i <= n; i++) {
    //         f = f * i;
    //     }
    //     return f;
    // }

    // public static void main(String args[]) {
    //     System.out.println(factorial(4));
    //}

    // binomial coefficieat
    // public static int bincoeff(int n, int r) {
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n - r);

    //     int bincoeff = fact_n / (fact_r * fact_nmr);
    //     return bincoeff;
    // }
    // public static void main(String args[]) {
    //     System.out.println(bincoeff(5,2));
    // }

    //function overloading
    //different no of input
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static int sum(int a, int b,int c) {
    //     return a + b + c;
    // }
    // public static void main(String args[]) {
    //     System.out.println(sum(3, 5));
    //     System.out.println(sum(5,2,1));
    // }

    //different data types
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static float sum(float a, float b) {
    //     return a + b;
    // }

    // public static void main(String args[]) {
    //     System.out.println(sum(3, 5));
    //     System.out.println(sum(5.1f, 2.9f));
    // }

    //is prime
    // public static boolean isPrime(int n) {
    //     if(n == 2){
    //         return true;
    //     }
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             return false;  
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String args[]) {
    //     System.out.println(isPrime(4));
    // }

    // public static boolean isPrime(int n) {
    //     if (n == 2) {
    //         return true;
    //     }
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String args[]) {
    //     System.out.println(isPrime(6));
    // }

    // public static void primeRange(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         if (isPrime(i)) {
    //             System.out.print(i+" ");
    //         }
    //     }
    // }  
    // public static void main(String args[]) {
    //     primeRange(20);
    // }

    //binary to decimal
    // public static void bintoDec(int binNum) {
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum = 0;
    //     while (binNum > 0) {
    //         int lastDigit = binNum % 10;
    //         decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

    //         pow++;
    //         binNum = binNum / 10;
    //     }
    //     System.out.println("decimal of " + myNum + " = " + decNum);
    // }

    // public static void main(String args[]) {
    //     bintoDec(111);
    // }

//     public static void dectoBin(int n) {
//         int decNum = n;
//         int pow = 0;
//         int binNum = 0;
        
//         while (n > 0) {
//             int rem = n % 2;
//             binNum = binNum + (rem * (int) Math.pow(10, pow));

//             pow++;
//             n = n / 2;
//         }
//     System.out.println("Binary no of "+decNum+" = " +binNum);
// }
//     public static void main(String args[]) {
//         dectoBin(7);
//     }
}
