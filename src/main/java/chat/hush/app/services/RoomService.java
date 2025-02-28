package chat.hush.app.services;

import chat.hush.app.Exceptions.RoomIdAlreadyExistsException;
import chat.hush.app.Exceptions.RoomIdNotFound;
import chat.hush.app.dto.RoomDTO;
import chat.hush.app.entities.Message;
import chat.hush.app.entities.Room;
import chat.hush.app.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public RoomDTO createRoom(String roomId) {
        if(roomRepository.findByRoomId(roomId) != null) {
            throw new RoomIdAlreadyExistsException("Room id " + roomId + "already exists!");
        } else {
            Room room = new Room(roomId);
            Room savedRoom = roomRepository.save(room);
            return new RoomDTO(savedRoom.getRoomId(), savedRoom.getMessages());
        }
    }

    public RoomDTO joinRoom(String roomId){
        Room room = roomRepository.findByRoomId(roomId);
        if(room == null){
            throw new RoomIdNotFound("Room with id: "+ roomId+" not found!");
        } else return new RoomDTO(
                room.getRoomId(),
                room.getMessages()
        );
    }

    public ArrayList<Message> getMessages(String roomId) {
        Room room = roomRepository.findByRoomId(roomId);
        if(room == null){
            throw new RoomIdNotFound("Room with id: "+ roomId+" not found!");
        } else return room.getMessages();
    }
 }
