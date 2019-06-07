public class ToMuchForOneTransaction extends RuntimeException {
    public ToMuchForOneTransaction(String message) {
        super(message);
    }
}
