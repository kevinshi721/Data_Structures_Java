import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author kevinshi721
 * @date 8/20/19 8:49 PM
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : nums1)
            treeSet.add(num);

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            if (treeSet.contains(num)) {
                list.add(num);
                treeSet.remove(num);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);

        return res;
    }
}
