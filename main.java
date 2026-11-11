
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Raj", 20, "MCA");
        Student s2 = new Student(102, "Priya", 21, "MTech");

        System.out.println("STUDENT MANAGEMENT SYSTEM");

        System.out.println("\nStudent 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}
