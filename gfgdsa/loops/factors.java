import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();

        for(int i=1; i<=Math.sqrt(n); i++){
            System.out.println(i);
            if(i != n/i){
                System.out.println(n/i);
            }
        }


        sc.close();
    }
}
