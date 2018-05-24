package innerchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cleint {
	public static void main(String[] args) throws Exception{
		try (Socket client = new Socket("192.168.20.3",30050);
				InputStream in = client.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				OutputStream out = client.getOutputStream();
				DataOutputStream  dos = new DataOutputStream(out); ){
			// 접속 시도 
			System.out.println("접속 시도");
			Scanner sc = new Scanner(System.in);


			new Thread() {
				public void run() {
					String msg;
					while(true) {
						try {
							msg = dis.readUTF();
							System.out.println(msg);
						} catch (IOException e) {break;}
					}
				}
			}.start();

			while(true) {
				String sendMsg = ";";
				try {
					sendMsg = JOptionPane.showInputDialog("write");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				dos.writeUTF(sendMsg);
				dos.flush();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
