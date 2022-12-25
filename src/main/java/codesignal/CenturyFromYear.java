package codesignal;

/*
Given a year, return the century it is in.
The first century spans from the year 1 up to and including the year 100,
the second - from the year 101 up to and including the year 200, etc.
 */
public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(solution(1905));

    }

    static int solution(int year) {
        if(year%100 == 0){
            return year/100;
        }else{
            return year = (year/100)+1;
        }
    }
}
