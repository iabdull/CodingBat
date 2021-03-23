/**
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 *
 * lastDigit(7, 17) -> true
 * lastDigit(6, 17) -> false
 * lastDigit(3, 113) -> true
 */
public boolean lastDigit(int a, int b) {
    int numberDigitsA = Integer.toString(a).length();
    int numberDigitsB = Integer.toString(b).length();
    int lastDigitA = 0;
    if(numberDigitsA == 1) {lastDigitA = a;}
    else {
        for (int i = numberDigitsA - 1; i > 0; i--) {
            lastDigitA = (int) (a % (Math.pow(10, i)));
        }
    }
    int lastDigitB = 0;
    if(numberDigitsB == 1) {lastDigitB = b;}
    else {
        for (int i = numberDigitsB - 1; i > 0; i--) {
            lastDigitB = (int) (b % (Math.pow(10, i)));
        }
    }
    if(lastDigitA == lastDigitB) {return true;}
    else {return false;}
}