package OOP;

class Student {
    String name;
    int registrationNumber;
    static String college = "Ramaiah";
    static int totalStudents = 0;

    Student(String name, int registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        totalStudents++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Registration No: " + registrationNumber);
        System.out.println("College: " + college);
        System.out.println();   
    }
}

public class Student_Counter {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        s1.display();
        s2.display();
        System.out.println("Total students created: " + Student.totalStudents);
    }
}
