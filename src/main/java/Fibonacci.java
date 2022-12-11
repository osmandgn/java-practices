public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c= 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a+b;
        }

    }
}