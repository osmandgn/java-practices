public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

//        int c;

//        c = a;
//        a = b;
//        b = c;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // 2. WAY

        a = a + b; // 7
        b = a - b; // 3
        a = a - b; // 4

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 3. WAY

        a = a * b; // 12
        b = a / b; //  3
        a = a / b; // 4




    }
}
