/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author looiwenghoong
 */
public class ClientHandler implements Runnable{

    private String name;
    private DataInputStream dis;
    private DataOutputStream dos;
    Socket s;
    
    public ClientHandler(Socket socket, String name, DataInputStream dis, DataOutputStream dos) {
        this.s = socket;
        this.dis = dis;
        this.dos = dos;
        this.name = name;
    }
    
    @Override
    public void run() {
        String receivedString;
        while(true) {
            try {
                receivedString = dis.readUTF();
                System.out.println(receivedString);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
}
