package codesignal;

/*

 */

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(solution("aabaa"));
        System.out.println(solution2("aabaa"));
    }


    static boolean solution(String inputString) {
        String newInputString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            newInputString += inputString.charAt(i);
        }

        if (inputString.equals(newInputString)) {
            return true;
        } else {
            return false;
        }

    }

    static boolean solution2(String inputString) {
        StringBuilder strb = new StringBuilder(inputString);
        String str = String.valueOf(strb.reverse());
        if (inputString.equals(str)) {
            return true;
        } else return false;
    }
}
