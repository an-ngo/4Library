package exception;

public class SameMSVException extends Exception {
    String message;

    public SameMSVException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }
}
