public class Substring{

    static boolean substring(String s1, String s2) {
        return s1.toLowerCase().contains(s2.toLowerCase()) ? true :false;
    }

    public static void main(String[] args) {
        System.out.println("Is s1 a substring of s2 --> "+ substring("SuperGod", "God"));
    }
}