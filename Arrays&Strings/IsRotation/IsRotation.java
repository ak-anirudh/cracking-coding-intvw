public class IsRotation {

    /**
     * ? Check if one String is a rotation of another
     */
    static boolean isRotation(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
    }

    public static void main(String[] args) {
        System.out.println("Is s1 a rotation of s2 --> " + isRotation("tackoverflows", "stackoverflwo"));
        System.out.println("Is s1 a rotation of s2 --> " + isRotation("tackoverflows", "overflowstack"));
    }
}
