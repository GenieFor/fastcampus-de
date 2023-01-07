package com.fastcampus.de.clip18;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

public class TcpClient {

    public static void main(String[] args) {
        String serverIp = "localhost";
        System.out.println("[" + LocalTime.now() + "]" + " Connecting to the server");
        System.out.println("[" + LocalTime.now() + "]" + " Server IP: " + serverIp);

        try {
            // 통신할 서버와의 Socket 생성
            Socket socket = new Socket(serverIp, 8888);

            // client가 data를 보내는 부분
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello\n".getBytes(StandardCharsets.UTF_8));
            outputStream.flush();   // 메모리에 있던 것을 어딘가로 내려보낸다는 의미

            // 서버에 data를 보내고 응답으로 무언가 줄 것을 읽음
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            
            // 서버의 응답을 출력하고 바로 연결을 끊음
            System.out.println("[" + LocalTime.now() + "]" + " message from server: " + dataInputStream.readUTF());
            dataInputStream.close();
            socket.close();

            System.out.println("[" + LocalTime.now() + "]" + " Connection is now closed.");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
