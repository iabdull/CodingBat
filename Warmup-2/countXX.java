/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 * countXX("abcxx") -> 1
 * countXX("xxx") -> 2
 * countXX("xxxx") -> 3
 */
int countXX(String str) {
    int xxCount = 0;
    for(int i = 0; i < str.length()-1; i++) {
        String immediateTwoString = str.substring(i, i+2);
        if(immediateTwoString.equals("xx")) {
            xxCount++;
        }
    }
    return xxCount;
}

