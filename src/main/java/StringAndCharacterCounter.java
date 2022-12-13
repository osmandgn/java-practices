import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAndCharacterCounter {

    public static void main(String[] args) {

        wordCounter("o bir deli o bir aptal o salak");


    }

    public static void numOfChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);

    }

    public static void kelimeBul(String str) {
        String[] strArray = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : strArray) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        Set<String> mySet = map.keySet();
        for (String w : mySet) {
            if (map.get(w) > 1) {
                System.out.println(w + " : " + map.get(w));
            }


        }

    }


    public static void wordCounter(String str) {
        HashMap<String, Integer> myMap = new HashMap<>();
        String[] strArray = str.split(" ");
        for (String w : strArray) {
            if (myMap.containsKey(w)) {
                myMap.put(w, myMap.get(w) + 1);
            } else {
                myMap.put(w, 1);
            }
        }

        for (Map.Entry<String, Integer> q : myMap.entrySet()) {
            if (q.getValue() > 1) {
                System.out.println(q);
            }
        }


    }



}
