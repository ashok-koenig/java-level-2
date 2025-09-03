public class LoopingStatementDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for(int i=0; i< 5; i++){
            numbers[i]= (i+1)*10;
        }

        System.out.println("Numbers are: ");
        int i=0;
        while (i<5){
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("Break the loop after the value 30: ");
        i=0;
        while (i<5){
            System.out.println(numbers[i]);
            if(numbers[i]==30){
                break;
            }
            i++;
        }

        System.out.println("Skip the value 30: ");

        i =0;
        do{
            if(numbers[i]==30){
                i++;
                continue;
            }
            System.out.println(numbers[i]);
            i++;
        }while (i<5);
    }
}
