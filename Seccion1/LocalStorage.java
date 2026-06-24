public class LocalStorage implements ReceiptStorage {
    @Override
    public void save() {
        System.out.println("Guardando recibo en disco local");
    }
}
