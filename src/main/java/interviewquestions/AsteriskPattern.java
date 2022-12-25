package interviewquestions;

public class AsteriskPattern {
    /*
    ```
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

     */

    public static void main(String[] args) {

        int row = 6;
        int c = 1;

        for (int i = 0; i <= row; i++) {

            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int t = 0; t < 1; t++) {
                System.out.print("*".repeat(c));
                c += 2;
            }
            System.out.println();

        }

        int p = 11;

        for (int i = 1; i <= row; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int v = 0; v < 1; v++) {
                System.out.print("*".repeat(p));
                p -= 2;
            }
            System.out.println();
        }


    }


}



