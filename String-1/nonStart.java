/**
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
 *
 * nonStart("Hello", "There") -> "ellohere"
 * nonStart("java", "code") -> "avaode"
 * nonStart("shotl", "java") -> "hotlava"
 */
public String nonStart(String a, String b) {
    String toReturn = "";
    for (int i = 1; i < a.length(); i++) {
        toReturn += a.charAt(i);
    }
    for (int i = 1; i < b.length(); i++) {
        toReturn += b.charAt(i);
    }
    return toReturn;
}