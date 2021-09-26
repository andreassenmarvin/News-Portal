public class Exception extends RuntimeException {
    private final int statusCode;

    public Exception(int statusCode, String msg) {
        super(msg);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}