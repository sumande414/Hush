package chat.hush.app.Controller;

import chat.hush.app.dto.RoomDTO;
import chat.hush.app.entities.Message;
import chat.hush.app.entities.Room;
import chat.hush.app.repositories.RoomRepository;
import chat.hush.app.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
@CrossOrigin("http://localhost:5173")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomService roomService;

    @PostMapping
    public ResponseEntity<RoomDTO> createRoomHandler(@RequestBody String roomId) {
        return ResponseEntity.ok(roomService.createRoom(roomId));
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<?> joinRoomHandler(@PathVariable String roomId) {
        return ResponseEntity.ok(roomService.joinRoom(roomId));
    }

    @GetMapping("/{roomId}/messages")
    public ResponseEntity<ArrayList<Message>> getMessages(@PathVariable String roomId) {
        return ResponseEntity.ok(roomService.getMessages(roomId));
    }


}
