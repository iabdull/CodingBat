/**
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if it is
 * 'z', so "ozymandias" yields "oz".
 *
 * startOz("ozymandias") -> "oz"
 * startOz("bzoo") -> "z"
 * startOz("oxx") -> "o"
 */
public String startOz(String str) {
    String toReturn = "";
    if(str.length() >= 2) {
        if(str.charAt(0) == 'o') {
            if(str.charAt(1) == 'z') {
                toReturn = "oz";
            }
            else {
                toReturn = "o";
            }
        }
        else if(str.charAt(1) == 'z') {
            toReturn = "z";
        }
    }
    else if(str.length() == 1) {
        if(str.charAt(0) == 'o') {
            toReturn = "o";
        }
    }
    else {
        toReturn = "";
    }
    return toReturn;
}