public class TypeCastingDemo {
    public static void main(String[] args) {
        // Widening casting
        int intVal = 100;
        long longVal = intVal;

        System.out.println("int -> long: "+ longVal);

        // Narrowing Casting (Manual)
        double originalDouble = 123.456;
        int castedInt = (int) originalDouble;
        System.out.println(" double -> int: "+ castedInt);
    }
}
