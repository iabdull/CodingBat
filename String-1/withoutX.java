/**
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 *
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */
public String withoutX(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        if(!(i == 0 && str.charAt(i) == 'x') && !(i == str.length() - 1 && str.charAt(i) == 'x')) {
            result += str.charAt(i);
        }
    }
    return result;
}