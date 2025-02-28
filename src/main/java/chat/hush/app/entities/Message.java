package chat.hush.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String sender;
    private String content;
    private LocalDateTime timeStamp;

    Message(String sender, String content){
        this.sender = sender;
        this.content = content;
        timeStamp = LocalDateTime.now();
    }
}
