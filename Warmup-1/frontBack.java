/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * frontBack("code") -> "eodc"
 * frontBack("a") -> "a"
 * frontBack("ab") -> "ba"
 */
public String frontBack(String str) {
    String result = "";
    if(str.length() == 1 || str.length() == 0) {return str;}
    else {
        String firstCharacter = str.substring(0, 1);
        String lastCharacter = str.substring(str.length() - 1, str.length());
        for(int i = 0; i < str.length(); i++) {
            if(i == 0) {
                result = lastCharacter;
            }
            else if (i != str.length() - 1) {
                result = result + str.charAt(i);
            }
            else {
                result = result + firstCharacter;
            }
        }
        return result;
    }
}
