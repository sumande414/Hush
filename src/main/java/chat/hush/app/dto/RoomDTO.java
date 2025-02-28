package chat.hush.app.dto;

import chat.hush.app.entities.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {
    private String roomId;
    private ArrayList<Message> messages = new ArrayList<>();
}
