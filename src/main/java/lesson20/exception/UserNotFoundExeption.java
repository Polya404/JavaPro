package lesson20.exception;

public class UserNotFoundExeption extends RuntimeException{
    public UserNotFoundExeption(String message) {
        super(message);
    }
}
