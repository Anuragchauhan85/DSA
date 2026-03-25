import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalidrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    //    char arr[]={'a','b','c','d'};
    //    String str="abcd";
    //    String str2=new String("xyz");
    //    //java strigs are immutable

    //    Scanner sc=new Scanner(System.in);
    //    String name;
    //    //    name = sc.next(); //sc.next only take one word sc.nextLine take full line.
    //    name = sc.nextLine();
    //    System.err.println(name);


    // String fullName = "Tony Stark";
    // System.out.println(fullName.length());


    //concatnation
    // String firstname = "Anurag";
    // String lastname = "chauhan";
    // String fullname = firstname + " " + lastname;
    // // System.out.println(fullname.charAt(0));  //charAt to find char at specific index

    // printLetters(fullname);

    String str = "noon";
    System.out.println(isPalidrome(str));
    }
} 
 