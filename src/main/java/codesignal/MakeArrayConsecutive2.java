package codesignal;

/*
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size.
Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous
one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArrayConsecutive2 {

    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));

    }


    static int solution(int[] statues) {
        Arrays.sort(statues);
        List<Integer> arr = new ArrayList<>();
        for(int w: statues){
            arr.add(w);
        }
        int counter = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) != 1) {
                Integer b = arr.get(i)+1;
               arr.add(i+1, b);
               counter++;
               i--;
            }

        }
        System.out.println(arr);
            return counter;

    }

}


