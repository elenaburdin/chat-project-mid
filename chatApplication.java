package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import lib.User;

public class chatApplication {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		User currentUser = new User("Ivan");
		
		Socket cleintConnection = new Socket("localhost", 8080);
		
		ObjectOutputStream oout=new ObjectOutputStream(cleintConnection.getOutputStream());
		
	    // serialization
		oout.writeObject( currentUser ); 
		oout.flush();
		
	
		System.out.println("OK");
		

	}

}
