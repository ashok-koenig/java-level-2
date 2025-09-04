import java.util.List;
import java.util.stream.Collectors;

public class ECommerceDemo {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(101, "John", 1500),
                new Order(102, "Peter", 1300),
                new Order(103, "Smith", 800),
                new Order(104, "Bob", 3500),
                new Order(105, "David", 500)
        );

        System.out.println("List of All Orders");
        orders.forEach(System.out::println);

        // Filter: order amount above 1000
        List<Order> highValueOrders = orders.stream().filter( order -> order.getAmount() > 1000).toList();

        System.out.println("High Value orders (>1000)");
        highValueOrders.forEach(System.out::println);

        // Map: Customer names in upper case
        List<String> customerNames = orders.stream().map(order -> order.getCustomerName().toUpperCase()).toList();
        System.out.println("Customer names in Uppercase");
        customerNames.forEach(System.out::println);

        // Reduce: Total order amount
//        double totalAmount = orders.stream().map(order -> order.getAmount()).reduce(0.0, (a, b)-> a+b);
        double totalAmount = orders.stream().map(Order::getAmount).reduce(0.0, Double::sum);

        System.out.println("Total order amount: "+ totalAmount);

        // Collect: IDs of high value orders
//        List<Integer> highValueOrderIds = orders.stream()
//                                                .filter(order -> order.getAmount() > 1000)
//                                                .map(order -> order.getId()).collect(Collectors.toList());
        List<Integer> highValueOrderIds = orders.stream()
                .filter(order -> order.getAmount() > 1000)
                .map(Order::getId).toList();

        System.out.println("IDs of high value orders: "+ highValueOrderIds);

        // Display all orders using for loop
//        for(Order order: orders){
//            System.out.println(order);
//        }
        // Display all orders using Lambda expression
//        orders.forEach((order) -> System.out.println(order));
        // Display all order using Method references
//        System.out.println("List of All Orders");
//        orders.forEach(System.out::println);
    }
}
