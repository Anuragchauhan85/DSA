package gfgdsa.ifelse;

import java.util.Scanner;

public class pofitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter selling price : ");
        double sp = sc.nextDouble();
        System.out.println("enter cost price : ");
        Double cp = sc.nextDouble();

        if (sp > cp) {
            System.out.println("profit of $:" +(sp-cp));
            System.out.println( ((sp-cp)/cp)*100+ "% Profit");
        }
        if (sp == cp) {
            System.out.println("no profit no loss");
        } if (sp<cp){
            System.out.println("loss of $:" +(cp-sp));
            System.out.println(((cp-sp)/cp)*100 + "% loss");
        }
        sc.close();
       

    }
}
