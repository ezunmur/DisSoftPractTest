public class S3Storage implements ReceiptStorage {
    @Override
    public void save() {
        System.out.println("Guardando recibo en Amazon S3");
    }
}
