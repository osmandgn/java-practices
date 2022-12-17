import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args){
        int sum = getTotalNumberOfLettersOfNamesLongerThanFive("Osmanlar", "Ali", "Erdem", "Mahmut");
        System.out.println(sum);
        Collection<String> stringList = mapToUppercase("Osmanlar", "Ali", "Erdem", "Mahmut");

        // making the arraylist object of List of Integer
        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        List<Integer> intList = transformInt(number);
        System.out.println(intList);
        System.out.println(longestWord(stringList));


    }


    //toUppercase
    public static Collection<String> mapToUppercase(String... names) {
       return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());

    }

//    The total number of letters in all the names with more than 5 letters
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).
                filter(t -> t.length() > 5).
                mapToInt(String::length).sum();
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream().
                flatMap(Collection::stream).
                collect(Collectors.toList());
    }
    public static List<Integer> transformInt(List<List<Integer>> collection) {
        return collection.stream().
                flatMap(list -> list.stream()).
                collect(Collectors.toList());
    }

    public static int longestWord(Collection<String> words){
        return words.stream().
                map(String::length).
                reduce(Integer::max).get();
    }













}
