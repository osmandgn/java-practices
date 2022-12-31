package interviewquestions;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String x = "*";
        String y = " ".repeat(i);
        for (int j = 0; j < i; j++) {
            System.out.print(y.substring(j));
            System.out.println(x);
            x = x + "**";
        }


        System.out.println(x);
        for (int j = i; j > 0; j--) {
            x = x.substring(0, x.length() - 2);
            System.out.print(y.substring((j - 1)));
            System.out.println(x);

        }
    }
}

