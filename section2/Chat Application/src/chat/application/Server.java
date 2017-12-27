/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class Server {

    private final int PORT = 9999;

    public Server() {
        String history = "";
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            byte message[] = new byte[1024];

            while (true) {
                System.out.println("Waiting on clients ...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to: " + clientSocket.getInetAddress());

                // reading from client
                InputStream inputStream = clientSocket.getInputStream();
                while (true) {
                    int length = inputStream.read(message);
                    if (length <= 0)
                        break;
                    String output = new String(message, 0, length);
                    System.out.println(clientSocket.getInetAddress() + " sent: " + output);
                    //System.out.println("Message length " + length);
                }
                /*
                history = history + ". " + output;

                // writing to client
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(history.getBytes());
                */
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        new Server();
    }
}
