package chat.hush.app.repositories;

import chat.hush.app.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
    Room findByRoomId(String id);
}
