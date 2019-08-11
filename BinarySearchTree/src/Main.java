import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
//        int[] nums = {5, 3, 6, 8, 4, 2};
//        for (int num : nums)
//            bst.add(num);
//
//        bst.preOrder();
//        System.out.println();
//
//        bst.preOrderNR();
//        System.out.println();
//
//        bst.inOrder();
//        System.out.println();
//
//        bst.postOrder();
//        System.out.println();
//
//        bst.levelOrder();
//        System.out.println();

        // test removeMin
        BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
        Random random = new Random();

        int n = 10;

        for (int i = 0; i < n; i++)
            bst2.add(random.nextInt(100));

        ArrayList<Integer> nums2 = new ArrayList<>();
        while (!bst2.isEmpty())
            nums2.add(bst2.removeMin());

        System.out.println(nums2);

        for (int i = 1; i < nums2.size(); i++)
            if (nums2.get(i) < nums2.get(i - 1))
                throw new IllegalArgumentException("error");
        System.out.println("removeMin test completed");


        // test removeMax
        BinarySearchTree<Integer> bst3 = new BinarySearchTree<>();
        Random random2 = new Random();

        int m = 10;

        for (int i = 0; i < m; i++)
            bst3.add(random2.nextInt(100));

        ArrayList<Integer> nums3 = new ArrayList<>();
        while (!bst3.isEmpty())
            nums3.add(bst3.removeMax());

        System.out.println(nums3);

        for (int i = 1; i < nums3.size(); i++)
            if (nums3.get(i) > nums3.get(i - 1))
                throw new IllegalArgumentException("error");
        System.out.println("removeMax test completed");
    }
}
