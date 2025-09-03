public class StringDemo {
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Peter";
        String name3 = "peter";

        System.out.println("Name 1: "+ name1);
        System.out.println("Name 2: ".concat(name2));

        System.out.println("Length of Name 1: "+ name1.length());

        System.out.println("name1 equals name2: "+ (name1.equals(name2)));
        System.out.println("name2 equals name3: "+ (name2.equals(name3)));
        System.out.println("name2 equals Ignore Case name3: "+ (name2.equalsIgnoreCase(name3)));

        String username = "   admin   ";
        System.out.println("Original username: '"+username+"'");
        username = username.trim();
        System.out.println("Trimmed username: '"+username+"'");
    }
}
