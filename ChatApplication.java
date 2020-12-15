package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import lib.User;

public class ChatApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
System.out.println("SERVER STARTING");
		
		ServerSocket serverConnection = new ServerSocket(8080);
		
		System.out.println("SERVER >> accepting client");
		Socket client = serverConnection.accept();
		
	   
		ObjectInputStream ois=new ObjectInputStream(client.getInputStream());  

        User chatUser =  (User) ois.readObject();
        
		System.out.println( chatUser); 
		
		serverConnection.close(); 
		
		System.out.println("SERVER ENDING");

	}

}
