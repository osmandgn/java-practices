public class ReverseAString {
    public static void main(String[] args) {
        String str = "erehber.org";
        StringBuilder strb = new StringBuilder(str);

        String reversedString = String.valueOf(strb.reverse());
        System.out.println(reversedString);

        String emptyString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            emptyString += str.charAt(i);
        }
        System.out.println(emptyString);

    }
}
