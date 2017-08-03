/* Combinations */
/* 
 * Given two integers n and k, return all possible combinations of k numbers out of 1 2 3 ... n.
 *
 * Make sure the combinations are sorted.
 *
 * To elaborate,
 * 1. Within every entry, elements should be sorted. [1, 4] is a valid entry while [4, 1] is not.
 * 2. Entries should be sorted within themselves.
 */

public class Solution {
    ArrayList<ArrayList<Integer>> coms;

    public ArrayList<ArrayList<Integer>> combine(int n, int k) {

        coms = new ArrayList<ArrayList<Integer>>();

        combinations(new ArrayList<Integer>(), 1, n, k);

        return coms;
    }

    private void combinations(ArrayList<Integer> current, int start, int n, int k) {
        if (k == 0) {
            coms.add(new ArrayList<Integer>(current));
            return;
        }

        for (int i=start; i<= n; i++) {
            current.add(i);
            combinations(current, i+1, n, k-1);
            current.remove(current.size() - 1);
        }
    }
}

