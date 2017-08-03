/* Number of 1 Bits */
/*
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.
 */

public class Solution {
    public int numSetBits(long a) {
        int numOnes = 0;

        while (a > 0) {
            numOnes += a % 2;
            a /= 2;
        }

        return numOnes;
    }
}
