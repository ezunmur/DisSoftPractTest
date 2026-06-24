public class PaypalPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con PayPal por $" + amount);
    }
}
