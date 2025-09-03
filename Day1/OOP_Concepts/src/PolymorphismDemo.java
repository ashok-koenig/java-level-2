class Calculator{
    int add(int a, int b){
        return a+b;
    }
    // Method Overloading
    int add(int a, int b, int c){
        return a+b+c;
    }

    String introduce(){
        return "I am simple calculator";
    }
}

class AdvancedCalculator extends Calculator{
    double power(double x, double y){
        return Math.pow(x,y);
    }
    // Method Overriding
    String introduce(){
        return "I am advanced calculator";
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Add 2 numbers: "+ calc.add(10,20));
        System.out.println("Add 3 numbers: "+ calc.add(10, 20, 30));
        System.out.println("Power of x to y: "+ calc.power(10, 3));
        System.out.println(calc.introduce());
    }
}
