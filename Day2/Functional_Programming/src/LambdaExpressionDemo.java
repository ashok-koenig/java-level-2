// Functional Interface
interface MathOperation{
    int operate(int a, int b);
}

interface SimpleInterface {
    void display();
}

//class Addition implements MathOperation{
//    @Override
//    public int operate(int a, int b) {
//        return a+b;
//    }
//}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
//        Addition addition = new Addition();
//        System.out.println("Result: "+ addition.operate(10, 20));
//        MathOperation addition = new MathOperation() {
//            @Override
//            public int operate(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println("Result: "+ addition.operate(10, 20));

        // Lambda expression
        MathOperation addition = (x, y ) -> x + y;
        System.out.println("Addition Result: "+ addition.operate(10, 20));

        MathOperation multiplication = (x, y)-> x * y;
        System.out.println("Multiplication Result: "+ multiplication.operate(10, 20));

        SimpleInterface welcome = () -> System.out.println("Welcome to Lambda expression");

        welcome.display();
    }
}
