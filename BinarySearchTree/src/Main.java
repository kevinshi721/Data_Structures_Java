import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums)
            bst.add(num);

        bst.preOrder();
        System.out.println();

        bst.preOrderNR();
        System.out.println();

        bst.inOrder();
        System.out.println();

        bst.postOrder();
        System.out.println();

        bst.levelOrder();
        System.out.println();

        BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
        Random random = new Random();

        int n = 20;

        for (int i = 0; i <n ; i++)
            bst2.add(random.nextInt(100));

        ArrayList<Integer> nums2 = new ArrayList<>();
        while(!bst2.isEmpty())
            nums2.add(bst2.removeMin());

        System.out.println(nums2);
    }
}
