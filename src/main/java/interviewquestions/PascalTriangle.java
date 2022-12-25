package interviewquestions;

public class PascalTriangle {
    public static void main(String[] args) {

        pascalTriangle(5);


    }

    public static void pascalTriangle(int g)
    {
        for (int s = 1; s <= g; s++) {
            for (int b = 0; b <= g - s; b++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int i = 1; i <= s; i++) {
                System.out.print(k + " ");
                k = k * (s - i) / i;

            }
            System.out.println();
        }
    }


}

