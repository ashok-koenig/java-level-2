class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    protected void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}

class Manager extends Person{
    String dept;
    Manager(String name, int age, String dept){
        super(name, age);
        this.dept = dept;
    }
    // Method Overriding
    public void display(){
        super.display();
//        System.out.println("Name: "+ name);
//        System.out.println("Age: "+ age);
        System.out.println("Department: "+ dept);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Person john = new Person("John", 22);
        john.display();
        Manager obj = new Manager("Ram", 25, "IT");
        obj.display();
    }
}
