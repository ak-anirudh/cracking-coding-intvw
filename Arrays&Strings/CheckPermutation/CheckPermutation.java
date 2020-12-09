import java.util.Arrays;

/** 
 * ? Given two strings, write a method to decide if one is a permutation of the other. 
 * */

public class CheckPermutation{

    // * Check permutation with additional DS
    private static boolean CheckPermutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    //  * Check permutation without Additional DS
    private static boolean checkStrings(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int check = 0;
        for (int i = 0; i < s1.length(); i++) {
            check ^= s1.charAt(i) ^ s2.charAt(i);
        }
        return check == 0;
    }

    public static void main(String[] args) {
        System.out.println("Is string s1 a permutation of string s2 -> " + CheckPermutation("gram","ramg"));
        System.out.println("Is string s1 a permutation of string s2 -> " + checkStrings("guru","ramg"));
    }
}