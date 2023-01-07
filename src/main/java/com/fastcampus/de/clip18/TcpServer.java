package com.fastcampus.de.clip18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class TcpServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        /* 서버 오픈 부분 */
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("[" + LocalTime.now() + "]" + " Server is ready to go.");
        }
        catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        /* 오픈 상태에서 대기하면서 요청 기다리는 부분 */
        while (true)
        {
            try {
                System.out.println("[" + LocalTime.now() + "]" + " Listening for a request.");
                Socket socket = serverSocket.accept();
                System.out.println("[" + LocalTime.now() + "]" + " Connection established.");

                // client에서 온 메세지를 받는 부분
                InputStream inputStream = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                String inputString = bufferedReader.readLine();
                System.out.println("message from client: " + inputString);

                // client에게 응답 메세지를 주는 부분
                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("Got your message Thx!");

                // 응답 메세지 전송 후 연결 종료
                System.out.println("[" + LocalTime.now() + "]" + " Successfully sent response.");
                dataOutputStream.close();
                socket.close();
            }
            catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }
}
