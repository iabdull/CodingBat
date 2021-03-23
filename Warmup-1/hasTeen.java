/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 *
 * hasTeen(13, 20, 10) -> true
 * hasTeen(20, 19, 10) -> true
 * hasTeen(20, 10, 13) -> true
 */
public boolean hasTeen(int a, int b, int c) {
    boolean aIsTeen = (a >= 13 && a <= 19);
    boolean bIsTeen = (b >= 13 && b <= 19);
    boolean cIsTeen = (c >= 13 && c <= 19);
    if(aIsTeen || bIsTeen || cIsTeen) {return true;}
    else {return false;}
}