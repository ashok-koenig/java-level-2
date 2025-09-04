import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    static void readFile(String filename) {
        // Checked exceptions
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println(reader.readLine());
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("File Error: "+ e);
        }catch (IOException e){
            System.out.println("IO Error: "+ e);
        }
    }

    static void divide(int a, int b){
        // Unchecked exception
        int result = a / b;
    }

    public static void main(String[] args) {
        readFile("example.txt");
        // unchecked exception handling
        try {
            divide(100, 0);
        }catch (ArithmeticException e){
            System.out.println("Unchecked exception: "+ e);
        }finally {
            System.out.println("Always execute code");
        }
    }
}
