public class InvalidNumberException extends Exception {
    private static String generalMessage = "Invalid Number was detected while processing the file";
    private String suggestion = "Check and Modify file if possible to prevent this exception";
    private int errorCode;
    private String errorSourceClass;

    public InvalidNumberException(String message, int errorCode, String errorSourceClass) {
        super(generalMessage + ":" + message);
        this.errorCode = errorCode;
        this.errorSourceClass = errorSourceClass;
    }

    public InvalidNumberException(String message) {
        super(generalMessage + ":" + message);
    }

    public InvalidNumberException() {
        super();
    }

    public static String getGeneralMessage() {
        return generalMessage;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorSourceClass() {
        return errorSourceClass;
    }
}
