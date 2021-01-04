import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {

    /**
     * ? Sort an array ot strings so that all tne anagrnms are next to each other.
     */

    // * With additional DS , not sorting whole array, but just grouping them.
    private static String[] getSortedAnagram(String[] array) {
        Map<String, ArrayList<String>> sortedMap = new HashMap<>();
        for (String a : array) {
            String sortedString = a.chars().sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
            sortedMap.computeIfAbsent(sortedString, s -> new ArrayList<>()).add(a);
        }
        String[] output = new String[array.length];
        List<String> list = sortedMap.values().stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(sortedMap);
        return list.toArray(output);
    }

    public static void main(String[] args) {
        String[] strArray = new String[] { "foo", "bar", "rab", "acre", "race", "care", "car" };
        System.out.println("Grouping Anagrams of an Array" + Arrays.toString(getSortedAnagram(strArray)));

        Arrays.sort(strArray, new AnagramComparator());
        System.out.println("Sorting and grouping the Array" + Arrays.toString(strArray));
    }
}

// *
class AnagramComparator implements Comparator<String> {
    public String sortChars(String s) {
        return s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public int compare(String sl, String s2) {
        return sortChars(sl).compareTo(sortChars(s2));
    }
}