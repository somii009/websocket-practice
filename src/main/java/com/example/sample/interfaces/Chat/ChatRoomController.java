package com.example.sample.interfaces.Chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/chat")
public class ChatRoomController {

    @GetMapping("/rooms")
    public String getRooms() {
        return "chat/rooms";
    }
}
