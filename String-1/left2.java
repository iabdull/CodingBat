/**
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
 *
 * left2("Hello") -> "lloHe"
 * left2("java") -> "vaja"
 * left2("Hi") -> "Hi"
 */
public String left2(String str) {
    String toReturn = "";
    for (int i = 2; i < str.length(); i++) {
        toReturn += str.charAt(i);
    }
    toReturn = toReturn + str.charAt(0) + str.charAt(1);
    return toReturn;
}