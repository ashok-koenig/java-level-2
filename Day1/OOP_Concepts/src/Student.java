public class Student {
    // Attributes (Instance Variables)
    String name;
    int age;
    int grade;

    // Default Constructor
    Student(){
        name = "Unknown";
        age=0;
        grade =0;
    }

    // Parameterized constructor
    Student(String n, int a, int g){
        name = n;
        age = a;
        grade = g;
    }

    // Methods
    void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+ grade);
    }

    public static void main(String[] args) {
        Student unknown = new Student();
        unknown.name ="Peter";
        unknown.age = 11;
        unknown.grade = 6;
        unknown.showDetails();

        Student john = new Student("John", 10, 5);
        john.name= "John Smith";
        john.showDetails();
    }
}
