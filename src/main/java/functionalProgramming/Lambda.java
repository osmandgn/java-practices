package functionalProgramming;

import java.util.*;
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
        Person person1 = new Person("Selami", 8, "Turkish");
        Person person4 = new Person("Mehmet", 35, "Turkish");
        Person person3 = new Person("Osman", 18, "Turkish");
        Person person2 = new Person("Ahmet", 25, "Turkish");
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person4);
        personList.add(person3);
        Person oldesPrs = getOldestPerson(personList);






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

    public static List<String> transformString(List<List<String>> collection) {
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

    public static void printOldestPerson(List<Person> people) {
        people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).limit(1).forEach(t -> System.out.println(t));

    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream().reduce((t, k) -> t.getAge() > k.getAge() ? t : k).get();
    }


}