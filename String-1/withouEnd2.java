/**
 * Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
 *
 * withouEnd2("Hello") → "ell"
 * withouEnd2("abc") → "b"
 * withouEnd2("ab") → ""
 */
public String withouEnd2(String str) {
    if(str.length() == 0 || str.length() == 1 || str.length() == 2) {
        return "";
    }
    else {
        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}