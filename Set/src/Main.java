import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words1)){
            System.out.println("Total words: " + words1.size());

            BSTSet<String> set1 = new BSTSet<>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();
        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if (FileOperation.readFile("a-tale-of-two-cities.txt", words2)){
            System.out.println("Total words: " + words2.size());

            BSTSet<String> set1 = new BSTSet<>();
            for (String word : words2)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();
        System.out.println("Pride and Prejudice");

        ArrayList<String> words3 = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words3)){
            System.out.println("Total words: " + words3.size());

            LinkedListSet<String> set1 = new LinkedListSet<>();
            for (String word : words3)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();
        System.out.println("A Tale of Two Cities");

        ArrayList<String> words4 = new ArrayList<>();
        if (FileOperation.readFile("a-tale-of-two-cities.txt", words4)){
            System.out.println("Total words: " + words4.size());

            LinkedListSet<String> set1 = new LinkedListSet<>();
            for (String word : words4)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }
    }
}
