package interviewquestions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDublicates {
    public static void main(String[] args) {
        //Given an integer array nums sorted in non-decreasing order,
        //remove the duplicates in-place such that each unique element appears only once.
        //The relative order of the elements should be kept the same.

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[nums.length];
        int idx = 0;


        for (int i = 0; i < nums.length; i++) {
            boolean rslt = true;
            for (int j = 0; j < expectedNums.length; j++) {
                if (expectedNums[j] == nums[i]) {
                    rslt = false;
                }
            }
            if (rslt) {
                expectedNums[idx] = nums[i];
                idx++;
            }

        }

        System.out.println(Arrays.toString(expectedNums));

        // 2. WAY

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int w: nums2){
            if (!arr.contains(w)){
                arr.add(w);
            }
        }
        System.out.println(arr);


        // 3. WAY

        int[] newNums = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(newNums));


        // 4. WAY
        HashSet<Integer> mySet = new HashSet<>();
        for (int w: nums){
            mySet.add(w);
        }
        System.out.println(mySet);

        // 5. WAY

        Set<Integer> newSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        System.out.println(newSet);

        // 6. WAY

        System.out.println("----------");

        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            boolean b = true;
            for (int j = 0; j< counter; j++){
                if (nums[j] == a){
                    b = false;
                }
            }
            if (b){
                nums[counter] = a;
                counter++;
            }
        }
        for (int i = counter; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));



    }
}
