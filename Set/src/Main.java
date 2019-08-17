import java.util.ArrayList;
import java.util.Random;


public class Main {

    private static double testSet(Set<String> set, String filename) {

        long startTime = System.nanoTime();

        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words)
                set.add(word);
            System.out.println("Total different words: " + set.getSize());
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

    public static void main(String[] args) {

        String filename = "pride-and-prejudice.txt";

        BSTSet<String> bstSet = new BSTSet<>();
        System.out.println("BST Set: " + testSet(bstSet, filename) + "s");

        System.out.println();

        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        System.out.println("LinkedList Set: " + testSet(linkedListSet, filename) + "s");
    }


}
