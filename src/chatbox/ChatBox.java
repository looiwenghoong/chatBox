/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbox;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ZhengKhai
 * @author LooiWengHoong
 */
public class ChatBox {

    private ServerSocket server;
    private ArrayList<Connection> list;
    private Socket s;
    private Set<String> userNames = new HashSet<>();
    private Set<Connection> userThreads = new HashSet<>();

    public ChatBox (int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server has been initialised on port " + port);
        }
        catch (IOException e) {
            System.err.println("error initialising server");
            e.printStackTrace();
        }
        list = new ArrayList<Connection>();
        while(true) {
            Connection c = null;
            try {
                
                s = server.accept();
                System.out.println(s);
                
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                
                c = new Connection(s, this, dis, dos);
                
                Thread t = new Thread(c);
                System.out.println("Adding new Client to active client list");
                list.add(c);
                
                t.start();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public void broadcast(String message, Connection excludeUsersConnection) {
        for (Connection clientHandler: list) {
            if(clientHandler != excludeUsersConnection) {
                clientHandler.sendMessages(message);
            }
        }
    }

    public ArrayList<String> getUserList() {
        ArrayList<String> userList = new ArrayList<String>();
        for( Connection clientThread: list){
            if(clientThread.getState() == Connection.STATE_REGISTERED) {
                userList.add(clientThread.getUserName());
            }
        }
        return userList;
    }

    public boolean doesUserExist(String newUser) {
        boolean result = false;
        for( Connection clientThread: list){
            if(clientThread.getState() == Connection.STATE_REGISTERED) {
                result = clientThread.getUserName().compareTo(newUser)==0;
            }
        }
        return result;
    }

    public void broadcastMessage(String theMessage){
        for( Connection clientThread: list){
            clientThread.sendMessages(theMessage);
        }
    }

    public boolean sendPrivateMessage(String message, String user) {
        for( Connection clientThread: list) {
            if(clientThread.getState() == Connection.STATE_REGISTERED) {
                if(clientThread.getUserName().compareTo(user)==0) {
                    clientThread.messageForConnection(message + System.lineSeparator());
                    return true;
                }
            }
        }
        return false;
    }

    public void removeDeadUsers(){
        Iterator<Connection> it = list.iterator();
        while (it.hasNext()) {
            Connection c = it.next();
            if(!c.isRunning())
                it.remove();
        }
    }

    public int getNumberOfUsers() {
        return list.size();
    }

    protected void finalize() throws IOException{
        server.close();
    }
    
}
