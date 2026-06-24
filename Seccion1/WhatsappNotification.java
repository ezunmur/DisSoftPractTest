public class WhatsappNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Enviando WhatsApp: " + message);
    }
}