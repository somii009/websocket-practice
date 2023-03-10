package com.example.sample.global.config;

import com.example.sample.ChatHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
//@RequiredArgsConstructor
//@EnableWebSocket
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/example").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        registry.setApplicationDestinationPrefixes("/test");
        registry.enableSimpleBroker("/topic", "queue");
    }
    //    private final ChatHandler chatHandler;
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(chatHandler, "ws/chat")
////                .setAllowedOrigins("http://localhost:8080")
//                .setAllowedOriginPatterns("http://*:8080", "http://*.*.*.*:8080")
//                .withSockJS()
//                .setClientLibraryUrl("http://localhost:8080/myapp/js/sock-client.js");
//    }

}
