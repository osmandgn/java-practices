import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args){
        int sum = getTotalNumberOfLettersOfNamesLongerThanFive("Osmanlar", "Ali", "Erdem", "Mahmut");
        System.out.println(sum);
        System.out.println(mapToUppercase("Osmanlar", "Ali", "Erdem", "Mahmut"));

    }


    //toUppercase
    public static Collection<String> mapToUppercase(String... names) {
       return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());

    }

//    The total number of letters in all the names with more than 5 letters
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        int sum = Arrays.stream(names).filter(t -> t.length() > 5).mapToInt(String::length).sum();
        return sum;
    }







}
