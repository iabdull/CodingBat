/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *
 * altPairs("kitten") -> "kien"
 * altPairs("Chocolate") -> "Chole"
 * altPairs("CodingHorror") -> "Congrr"
 */
public String altPairs(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        if(i % 4 == 0) {
            result = result + str.charAt(i);
        }
        else if ((i - 1) % 4 == 0) {
            result = result + str.charAt(i);
        }
    }
    return result;
}
