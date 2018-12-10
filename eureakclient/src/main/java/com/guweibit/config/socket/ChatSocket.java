package com.guweibit.config.socket;


import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/chatroom")
@Component
public class ChatSocket {
    public static Session session;
    private static CopyOnWriteArraySet<ChatSocket> set = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        set.add(this);
        System.out.println("socket open");
    }

    @OnClose
    public void onClose() {
        set.remove(this);
        System.out.println("socket close");
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("from client:" + message);
        for (ChatSocket socket : set) {
            try {
                socket.sendMessage(message);
            } catch (IOException e) {
            }
        }
    }

    @OnError
    public void onError(Throwable error) {
        System.out.println("error occurred");
        error.printStackTrace();
    }

    public static void sendMessage(String message) throws IOException {
        System.out.println("主动发送消息给前端");
        session.getBasicRemote().sendText(message);
    }
}
