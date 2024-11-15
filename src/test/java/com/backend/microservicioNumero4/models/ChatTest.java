package com.backend.microservicioNumero4.models;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChatTest {

    @Test
    public void testConstructorAndGetters() {
        // Datos de prueba
        String id = "chat123";
        LocalDateTime createdAt = LocalDateTime.now();
        LocalDateTime updateAt = LocalDateTime.now().plusDays(1);
        String chatName = "Group Chat";
        Boolean isGroupChat = true;
        List<String> participants = Arrays.asList("user1", "user2", "user3");
        List<Message> messages = Arrays.asList(
                new Message("1", "user1", "user2", "Hello!", LocalDateTime.now()),
                new Message("2", "user2", "user1", "Hi!", LocalDateTime.now()));

        // Creación del objeto `Chat` utilizando el constructor
        Chat chat = new Chat(id, createdAt, updateAt, chatName, isGroupChat, participants, messages);

        // Pruebas de los valores asignados
        assertEquals(id, chat.getId());
        assertEquals(createdAt, chat.getCreatedAt());
        assertEquals(updateAt, chat.getUpdateAt());
        assertEquals(chatName, chat.getChatName());
        assertTrue(chat.getIsGroupChat());
        assertEquals(participants, chat.getParticipants());
        assertEquals(messages, chat.getMessages());
    }

    @Test
    public void testSetters() {
        // Creación de un objeto `Chat` vacío
        Chat chat = new Chat(null, null, null, null, null, null, null);

        // Nuevos datos para los setters
        String id = "chat123";
        LocalDateTime createdAt = LocalDateTime.now();
        LocalDateTime updateAt = LocalDateTime.now().plusDays(1);
        String chatName = "Group Chat";
        Boolean isGroupChat = true;
        List<String> participants = Arrays.asList("user1", "user2", "user3");
        List<Message> messages = Arrays.asList(
                new Message("1", "user1", "user2", "Hello!", LocalDateTime.now()),
                new Message("2", "user2", "user1", "Hi!", LocalDateTime.now()));

        // Asignación de valores usando setters
        chat.setId(id);
        chat.setCreatedAt(createdAt);
        chat.setUpdateAt(updateAt);
        chat.setChatName(chatName);
        chat.setIsGroupChat(isGroupChat);
        chat.setParticipants(participants);
        chat.setMessages(messages);

        // Validación de que los setters han asignado los valores correctamente
        assertEquals(id, chat.getId());
        assertEquals(createdAt, chat.getCreatedAt());
        assertEquals(updateAt, chat.getUpdateAt());
        assertEquals(chatName, chat.getChatName());
        assertTrue(chat.getIsGroupChat());
        assertEquals(participants, chat.getParticipants());
        assertEquals(messages, chat.getMessages());
    }
}
