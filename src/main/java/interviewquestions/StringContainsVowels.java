package interviewquestions;

public class StringContainsVowels {

    public static void main(String[] args) {
        String str1 = "Movie";
        System.out.println(isStringContainsVowels(str1)); // true
        String str2 = "TV";
        System.out.println(isStringContainsVowels(str2)); // false

    }
    public static boolean isStringContainsVowels(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
