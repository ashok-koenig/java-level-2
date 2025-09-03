public class Employee {
    String name;
    double salary;

    Employee(){
        this("unknown", 0.0);
    }

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: "+ this.name + ", Salary : "+ this.salary);
    }

    public static void main(String[] args) {
        Employee unknown = new Employee();
        unknown.display();

        Employee peter = new Employee("Peter", 56000.0);
        peter.display();
    }
}
