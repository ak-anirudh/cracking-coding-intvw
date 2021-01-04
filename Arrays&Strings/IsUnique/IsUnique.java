import java.util.Set;
import java.util.stream.Collectors;

/**
 * ? Implement an algorithm to determine if a string has all unique characters.
 * ? What if you cannot use additional data structures (DS)?
 */
public class IsUnique {

    // * With additional DS
    private static boolean isUniqueNoDS(String copy) {
        if (copy.length() <= 1)
            return true;
        Set<Character> set = copy.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        if (set.size() < copy.length()) {
            return false;
        }
        return true;
    }

    // * Without additional DS
    public static boolean isUniqueChars(String str) {
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((check & (1 << val)) > 0)
                return false;

            check |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(" IsUnique ? -> " + isUniqueNoDS("GREAT"));
        System.out.println(" IsUnique ? -> " + isUniqueChars("AMAZON"));
    }

}
