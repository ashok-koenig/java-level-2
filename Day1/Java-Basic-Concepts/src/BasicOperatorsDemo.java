public class BasicOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b=5;
        System.out.println("a= "+ a +", b="+ b);
        // Arithmetic Operations
        System.out.println("Arithmetic Operations");
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));

        System.out.println("Relational Operations");
        System.out.println("a > b = "+ (a>b));
        System.out.println("a < b = "+ (a<b));
        System.out.println("a >= b = "+ (a>=b));
        System.out.println("a <= b = "+ (a<=b));
        System.out.println("a == b = "+ (a==b));
        System.out.println("a != b = "+ (a!=b));

        // Logical Operations
        boolean x = true, y=false;

        System.out.println("Logical Operations");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x  = " + (!x));

        // Bitwise Operations
        int m = 5, n = 3;
        System.out.println("Bitwise Operations");
        System.out.println("m & n : " + (m & n));
        System.out.println("m | n : " + (m | n));
        System.out.println("m ^ n : " + (m ^ n));

    }
}
