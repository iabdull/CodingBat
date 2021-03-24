/**
 * Given a string, return true if it ends in "ly".
 *
 * endsLy("oddly") → true
 * endsLy("y") → false
 * endsLy("oddy") → false
 */
public boolean endsLy(String str) {
    return str.length() >= 2 && str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y';
}