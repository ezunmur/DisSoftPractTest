public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando transferencia bancaria por $" + amount);
    }
}