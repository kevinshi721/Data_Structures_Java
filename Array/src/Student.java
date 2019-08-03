/**
 * @author kevinshi721
 * @package PACKAGE_NAME
 * @date 7/31/19 1:00 AM
 */
public class Student {
    private String name;
    private int score;

    public Student(String studentName, int studentScore){
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {

        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 80));
        arr.addLast(new Student("Kevin", 88));
        System.out.println(arr);
    }

}
