/**
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 *
 * in3050(30, 31) -> true
 * in3050(30, 41) -> false
 * in3050(40, 50) -> true
 */
public boolean in3050(int a, int b) {
    boolean between30and40 = false;
    if(a >= 30 && a <= 40 && b >= 30 && b <= 40) {
        between30and40 = true;
    }
    boolean between40and50 = false;
    if(a >= 40 && a <= 50 && b >= 40 && b <= 50) {
        between40and50 = true;
    }
    if(between30and40 || between40and50) {
        return true;
    }
    else {
        return false;
    }
}