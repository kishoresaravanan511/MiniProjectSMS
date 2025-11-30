import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//import java.util.*;    it imports all classes and interfaces in utility package.

// Abstract class - Abstraction
abstract class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {    //constructor
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters - Encapsulation   id,name,age must be private variables
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }  //Here we do not set id by using setter method , because we identify student only by id it might not be changeable,it leads to duplicate id's ,so that ,it makes ease use for search and remove student with help of id's.
    public void setAge(int age) { this.age = age; }

    // Abstract method - to be overridden
    public abstract void displayInfo();   //abstract method
}

// Inheritance
class StudentList extends Person {   //child class of parent Person
    private String course;
    private double grade;

    public StudentList(int id, String name, int age, String course, double grade) {
        super(id, name, age);
        this.course = course;
        this.grade = grade;
    }
    // getters and setters
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    // Polymorphism - overriding displayInfo()
    @Override
    public void displayInfo() {    //run time polymorphism  for getting id,name,age,....
        System.out.println("ID: " + getId() + " | Name: " + getName() + " | Age: " + getAge() +
                " | Course: " + course + " | Grade: " + grade);
    }
}

// Management class
class StudentManagementSystem {
    private List<StudentList> students = new ArrayList<>();    //Array list collections

    // Add student
    public void addStudent(StudentList student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {  //isEmpty() returns boolean
            System.out.println("No students found!");
            return;
        }
        for (StudentList s : students) {  //for each
            s.displayInfo();
        }
    }

    // Search student by ID
    public StudentList searchStudent(int id) {
        for (StudentList s : students) {
            if (s.getId() == id) {
                s.displayInfo();
                return s;
            }
        }
        System.out.println("OOP's, Student not found!");
        return null;
    }

    // Remove student
    public void removeStudent(int id) {
        StudentList s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Yeah, Student removed successfully!");
        }
    }
}

// Main class
public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    //sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();

                    StudentList s = new StudentList(id, name, age, course, grade);
                    sms.addStudent(s);
                    break;

                case 2:
                    sms.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    sms.searchStudent(sid);
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    sms.removeStudent(rid);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
