/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class Client {
    private final String HOSTNAME = "172.17.0.134";
    private final int PORT = 9999;

    public Client() {
        // we need to set up a chatting protocol
        
        try {
            Socket serverSocket = new Socket(HOSTNAME, PORT);
            System.out.println("Connected to the server!");
            
            byte array[] = new byte[1024];
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();
                if (message.equals("DONE"))
                    break;
                OutputStream outputStream = serverSocket.getOutputStream();
                outputStream.write(message.getBytes());
            }
            
            /*
            InputStream inputStream = serverSocket.getInputStream();
            int length = inputStream.read(array);
            message = new String(array, 0, length);
            System.out.println("Server sent " + message);
            */
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        new Client();
    }
   
}
