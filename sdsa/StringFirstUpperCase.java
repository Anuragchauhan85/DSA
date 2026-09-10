public class StringFirstUpperCase {

    public static String firstupperCase(String str) {
        StringBuilder UpCase = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        UpCase.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                UpCase.append(str.charAt(i));
                i++;
                UpCase.append(Character.toUpperCase(str.charAt(i)));
            } else {
                UpCase.append(str.charAt(i));
            }
        }
        return UpCase.toString();
    }
    public static void main(String[] args) {
        String str = "hi i am anurag";
        System.out.println(firstupperCase(str));
    }
}
