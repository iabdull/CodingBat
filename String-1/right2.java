/**
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
 *
 * right2("Hello") → "loHel"
 * right2("java") → "vaja"
 * right2("Hi") → "Hi"
 */
public String right2(String str) {
    String toReturn = str.charAt(str.length() - 2) + Character.toString(str.charAt(str.length() - 1));
    for (int i = 0; i < str.length() - 2; i++) {
        toReturn += str.charAt(i);
    }
    return toReturn;
}