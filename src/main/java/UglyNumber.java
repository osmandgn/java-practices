public class UglyNumber {
    
    public static void main(String[] args) {


        /*
        Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
        The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
        By convention, 1 is included. Given a number n, the task is to find n’th Ugly number.
         */

        int sa = 14;

        while (sa % 2 == 0){
            sa /= 2;
        }
        while (sa % 3 == 0){
            sa /= 3;
        }
        while (sa % 5 == 0){
            sa /= 5;
        }

        if (sa == 1){
            System.out.println("Ugly Number");
        }else System.out.println("It's Not");


    }






}
