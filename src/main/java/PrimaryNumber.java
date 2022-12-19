import java.util.stream.IntStream;

public class PrimaryNumber {
    public static void main(String[] args) {

        isItPrimary(14); // Is it Primary ? -> It is not Primary
        getPrimaryNumbers(5); // First 5 Primary Number -> 2 3 5 7 11
        System.out.println();
        primaryNumber(20);


    }

    public static void isItPrimary(int x) {
        boolean result = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                result = false;
            }
        }
        if (result) {
            System.out.println("It is Primary");
        } else System.out.println("It is not Primary ");
    }

    public static void getPrimaryNumbers(int x) {
        int max = Integer.MAX_VALUE;
        for (int i = 2; i < max; i++) {
            boolean result = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = false;
                }
            }
            if (result) {
                System.out.print(i + " ");
                x--;
                if (x == 0) {
                    break;
                }
            }

        }


    }

    public static void primaryNumber(int s){
        IntStream.range(2, s).filter(t -> {boolean a = true; for (int i = 2; i < t; i++) {if (t % i == 0){a = false;}}
            return a;
        }).forEach(System.out::print);
    }


}
