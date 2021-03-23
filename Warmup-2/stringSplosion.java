/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 * stringSplosion("Code") -> "CCoCodCode"
 * stringSplosion("abc") -> "aababc"
 * stringSplosion("ab") -> "aab"
 */
public String stringSplosion(String str) {
    int count = 0;
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        result = result + str.substring(0, count+1);
        count++;
    }
    return result;
}