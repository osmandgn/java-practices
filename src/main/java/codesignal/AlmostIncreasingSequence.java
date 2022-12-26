package codesignal;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 5, 3, 5};
        System.out.println(solution(sequence));
        // [1, 3, 2, 1]


    }


    // [1, 2, 5, 3, 5]
    // i,   i+1 den buyuk  ve i+2 den buyuk (veya esit) ise i silinecek
    // 1, 2, 5, 3, 6]
    // i,   i+1 den buyuk fakat i+2'den kucuk ise i+1 silinecek
    //1, 2, 1, 2
    //  {1, 2, 5, 3, 5};


    static boolean solution(int[] sequence) {
        int counter = 0;

        for (int i = 0; i < sequence.length - 2 && counter <= 2; i ++) {
            int a = sequence[i];
            int b = sequence[i+1];
            int c = sequence[i+2];

            if (a >= b) {
                counter++;
                sequence[i] = b -1;
            }
            //1, 2, 1, 2
            //  {1, 2, 5, 3, 5};
            if (b >= c){
                counter++;

                if (a == c) {
                    sequence[i+2] = b +1;
                } else {
                    sequence[i+1] = a;
                }
            }
        }

        return counter <= 1;

    }
}

