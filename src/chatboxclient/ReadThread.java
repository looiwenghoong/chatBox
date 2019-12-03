/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatboxclient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author looiwenghoong
 */
public class ReadThread extends Thread {
    private BufferedReader reader;
    private Socket socket;
    private ChatBoxClient client;
    
    public ReadThread(Socket socket, ChatBoxClient client) {
        this.socket = socket;
        this.client = client;     
        
        try {
            InputStream input = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(input));
        } catch (Exception e) {
            System.out.println("Error getting input stream: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void run() {
        while(true) {
            try {
                String response = reader.readLine();
                System.out.println(response);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
