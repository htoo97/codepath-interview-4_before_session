/* Permutations */
/*
 * Given a collection of numbers, return all possible permutations.
 *
 * - No two entries in the permutation sequence should be the same.
 * - For the purpose of this problem, assume that all the numbers in 
 * the collection are unique.
 */

public class Solution {

    ArrayList<int[]> list;

    public int[][] permute(int[] A) {

        list = new ArrayList<int[]>();

        Arrays.sort(A);

        permute(A, 0, A.length - 1);

        return list.toArray(new int[list.size()][A.length]);
    }

    private void permute(int[] arr, int l, int r) {
        if (l == r) {
            list.add(arr);
        }
        else {
            for (int i=l; i<=r; i++) {
                arr = swap(arr, l, i);
                permute(arr, l+1, r);
                arr = swap(arr, l, i);
            }
        }
    }

    private int[] swap(int[] a, int i, int j) {
        int[] arr = Arrays.copyOf(a, a.length);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
        return arr;
    }
}

