public class StringSubString {
    
    //complex or logical approch
    public static String subString(String str, int si, int ei) {
        String SA = ""; 
        for (int i = si; i < ei; i++) {
            SA += str.charAt(i);
        }
        return SA;
 }

    public static void main(String args[]) {
        
        String str = "helloWorld";
        System.out.println(subString(str, 0, 5));
        //inbuilt method for subString in java
        System.out.println(str.substring(0,5));
    }
}
