interface Notification{
    void send(String message);
}
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Notification emailNotification = new Notification() {
            @Override
            public void send(String message) {
                System.out.println("Sending email: "+ message);
            }
        };

        Notification smsNotification = new Notification() {
            @Override
            public void send(String message) {
                System.out.println("Sending sms: "+ message);
            }
        };

        emailNotification.send("This is email notification");
        smsNotification.send("This is sms notification");
    }
}
