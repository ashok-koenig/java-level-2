import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    /*
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
        }catch (Exception e){
            System.out.println("Generic Exception: "+ e);
        }
    }
     */

    static void readFile(String filename) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        System.out.println(reader.readLine());
        reader.close();
    }

    static void divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("B value is zero");
        }
        int result = a / b;
        System.out.println("Result is: "+ result);
    }

    public static void main(String[] args) {
        // Checked exception handling
        try {
            readFile("example.txt");
        }catch (FileNotFoundException e){
            System.out.println("File Error: "+ e);
        }catch (IOException e){
            System.out.println("IO Error: "+ e);
        }

        // unchecked exception handling
        try {
            divide(100, 10);
        }catch (ArithmeticException e){
            System.out.println("Unchecked exception: "+ e);
        }finally {
            System.out.println("Always execute code");
        }
    }
}
