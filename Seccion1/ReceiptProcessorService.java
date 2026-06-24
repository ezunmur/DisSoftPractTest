
public class ReceiptProcessorService {
    private final ReceiptGenerator generator;
    private final ReceiptStorage storage;

    public ReceiptProcessorService(ReceiptGenerator generator, ReceiptStorage storage) {
        this.generator = generator;
        this.storage = storage;
    }

    public void executeReceiptFlow() {
        generator.generateReceipt();
        storage.save();
    }
}