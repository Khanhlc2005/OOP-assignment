import java.util.ArrayList;
import java.util.Scanner;

public class ManagementStudentApp {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add a Student:");
        addStudent(sc);

        System.out.println("View a Student:");
        viewStudent(sc);

        System.out.println("Add List of Students:");
        addListOfStudent(sc);

        System.out.println("Print List of Students:");
        printListOfStudent();

        System.out.println("Find the Best Student:");
        findTheBestOfStudent();

        sc.close();
    }

    public static void addStudent(Scanner sc) {
        Student st = new Student();
        System.out.print("Enter Student ID: ");
        st.setStudentID(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        st.setStudentName(sc.nextLine());
        System.out.print("Enter Math Mark: ");
        st.setMath(sc.nextDouble());
        System.out.print("Enter Physic Mark: ");
        st.setPhysic(sc.nextDouble());
        System.out.print("Enter Chemistry Mark: ");
        st.setChemistry(sc.nextDouble());
        students.add(st);
        System.out.println("Student added successfully.");
    }

    public static void viewStudent(Scanner sc) {
        System.out.print("Enter Student ID to view: ");
        int id = sc.nextInt();
        for (Student st : students) {
            if (st.getStudentID() == id) {
                printStudent(st);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void addListOfStudent(Scanner sc) {
        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            addStudent(sc);
        }
    }

    public static void printListOfStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        for (Student student : students) {
            printStudent(student);
        }
    }

    public static void findTheBestOfStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        Student best = students.get(0);
        for (Student student : students) {
            if (student.AvrgMark() > best.AvrgMark()) {
                best = student;
            }
        }
        System.out.println("The best student is:");
        printStudent(best);
    }

    public static void printStudent(Student student) {
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Math Mark: " + student.getMath());
        System.out.println("Physic Mark: " + student.getPhysic());
        System.out.println("Chemistry Mark: " + student.getChemistry());
        System.out.println("Average Mark: " + student.AvrgMark());
        System.out.println("Rate: " + student.getRate());
    }
}
