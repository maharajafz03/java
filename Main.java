class Student {
    public String name;
    public int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student details = new Student("Maharaja", 25);
        System.out.println("Name: " + details.name);
        System.out.println("Age: " + details.age);
    }
}
