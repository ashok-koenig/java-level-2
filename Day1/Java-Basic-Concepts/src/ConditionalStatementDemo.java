public class ConditionalStatementDemo {
    public static void main(String[] args) {
        int num = 1;
        // if statement
        if(num > 0 ){
            System.out.println("The number is positive");
        }
        // if-else statement
        if(num % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        // nested if-else statement
        if(num>= 0){
            if(num == 0){
                System.out.println("The number is zero");
            }else{
                System.out.println("The number is greater than zero");
            }
        }else {
            System.out.println("The number is less than zero");
        }

        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
