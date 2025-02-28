package chat.hush.app.Exceptions;

public class RoomIdAlreadyExistsException extends RuntimeException {
    public RoomIdAlreadyExistsException(String message) {
        super(message);
    }
}
