package chat.hush.app.Exceptions;

public class RoomIdNotFound extends RuntimeException {
    public RoomIdNotFound(String message) {
        super(message);
    }
}
