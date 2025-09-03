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
// IS-A Relationship: Manager IS-A Person
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
// HAS-A relationship: Department HAS-A Manager
class Department {
    String deptName;
    Manager manager;
    Department(String deptName, Manager manager){
        this.deptName = deptName;
        this.manager = manager;
    }
    void showDetail(){
        manager.display();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Person john = new Person("John", 22);
//        john.display();
        Manager ram = new Manager("Ram", 25, "IT");
//        ram.display();

        Department it = new Department("IT", ram);
        it.showDetail();
    }
}
