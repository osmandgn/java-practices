package functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda {

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

    public static Person getOldestPerson2(List<Person> people) {
        return people.stream().max(Comparator.comparing(Person::getAge)).orElse(null);
    }


    //Sum all elements of a collection, try to use the reduce operator with identity parameter instead of an IntStream

    public static int calculateTotal(List<Integer> numbers) {
        return numbers.stream().reduce(Math::addExact).orElse(null);
    }

    public static int calculateTotal1(List<Integer> numbers) {
        return numbers.stream().reduce(Math::addExact).get();
    }



    public static Set<String> getKidNames(List<Person> people) {
        return people.stream().filter(t -> t.getAge() < 18).map(t -> t.getName()).collect(Collectors.toSet());
    }


    public static Map<Boolean, List<Person>> partitionAdults1(List<Person> people) {
       return people.stream().collect(Collectors.
               groupingBy(person -> person.getAge() >= 18, Collectors.toList()));

    }

    public static Map<String, List<Person>> groupByNationaly(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getNationality, Collectors.toList()));
    }

    public static String namesToString1(List<Person> people) {
        return "Names: " +  people.stream().map(Person::getName).reduce((t, s) -> t + ", " + s).get() + ".";
    }

    public static String namesToString(List<Person> people) {
        return "Names: " +
                people.stream().map(Person::getName).collect(Collectors.joining(", ")) +
                ".";
    }

    public static String getString(List<Integer> list) {
        return list.stream().map(t -> t % 2 == 0 ? "e" + t : "o" + t).collect(Collectors.joining(","));
    }



    public static String getString1(List<Integer> list) {
        return list.stream().
                map(t -> {String s = "";
                    if (t % 2 == 0){s += "e" + t;}
                    else{s+= "o" + t;} return s;})
                .collect(Collectors.joining(","));
    }



















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
        Person oldestPerson = getOldestPerson(personList);
        Person oldestPerson2 = getOldestPerson2(personList);
        System.out.println(oldestPerson);
        System.out.println(oldestPerson2);

        System.out.println("--------------");
        List<Integer> inList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(getString(inList));
        System.out.println(getString1(inList));
        in


    }





}
