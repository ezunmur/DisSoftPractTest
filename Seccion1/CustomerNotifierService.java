public class CustomerNotifierService {
    private final NotificationChannel channel;

    public CustomerNotifierService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void dispatchNotification(String message) {
        channel.send(message);
    }
}