import java.util.Random;

/**
 * @author kevinshi721
 * @date 7/28/19 3:57 PM
 */

public class Main {

    private static double testStack(Stack<Integer> s, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++)
            s.push(random.nextInt(Integer.MAX_VALUE));
        for (int i = 0; i < opCount; i++)
            s.pop();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

    public static void main(String[] args) {

        int opCount = 100000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time = " + time1 + "s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("LinkedListStack, time = " + time2 + "s");

    }
}
