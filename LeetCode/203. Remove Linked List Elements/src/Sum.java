/**
 * @author kevinshi721
 * @date 8/5/19 10:36 PM
 */
public class Sum {

    // for user
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    // for developer
    private static int sum(int[] arr, int l) {
        if (l == arr.length)
            return 0;
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(nums));
    }
}
