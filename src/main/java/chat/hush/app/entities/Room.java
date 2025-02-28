package chat.hush.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "rooms")
public class Room {
    @MongoId
    private String id;
    private String roomId;
    private ArrayList<Message> messages = new ArrayList<>();
    public Room(String roomId) {
        this.roomId = roomId;
    }
}
