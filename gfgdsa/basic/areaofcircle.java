import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Radius : ");
        double r= sc.nextDouble();
        double a=3.141592*r*r;
        System.out.println("Area of circle is : " + a);
        sc.close();
    }
}
