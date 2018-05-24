package multichatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cleint {
	public static void main(String[] args) throws Exception{
		try {
			// 접속 시도 
			Socket client = new Socket("192.168.20.32",8000);
			System.out.println("접속 시도");
			SendMsg sm = new SendMsg(client);
			sm.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

