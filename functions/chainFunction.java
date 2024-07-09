public class chainFunction {

    private String message;

    public chainFunction setMessage(String message) {
        this.message = message;
        return this;
    }

    public chainFunction appendMessage(String additionalMessage) {
        this.message += " " + additionalMessage;
        return this;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        chainFunction example = new chainFunction();

        example.setMessage("Hello")
               .appendMessage("World!")
               .appendMessage("How are you?")
               .printMessage();
    }
}