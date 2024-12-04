import java.util.Scanner;

class Student {
    String name, grade;
    int age;

    Student(String n, int a, String g) {
        name = n;
        age = a;
        grade = g;
    }

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGrade: " + grade);
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student 1 Details:");
        Student s1 = new Student(s.nextLine(), s.nextInt(), s.nextLine());

        System.out.println("Enter Student 2 Details:");
        Student s2 = new Student(s.nextLine(), s.nextInt(), s.nextLine());

        System.out.println("\nStudent 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}