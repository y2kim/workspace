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
// 이너 클래스는 멤버변수를 사용해야한다 
// 익명 이너 클래스를 많이 사용한다.
public class Server {
	public static void main(String[] args) throws Exception {
		try (ServerSocket server = new ServerSocket(8080);Socket socket =server.accept();
				OutputStream out = socket.getOutputStream();
				DataOutputStream  dos = new DataOutputStream(out);
				DataInputStream dis = new DataInputStream(socket.getInputStream());){
			
			System.out.println("서버를 가동했습니다");
			Scanner sc = new Scanner(System.in);

			System.out.println(socket.getInetAddress() + " 연결"); 
			// Thread th = new Thread()  <- 그냥 스레드 이지만  {} 추가 해서 변조 가하면 더이상 스래드 클래스가 아니다 // 사실상 이름없는 클래스임 // 익명클래스 
			//Thread th =  
			new Thread() {//평범한 클래스임   , 기본클래스 수정하는것  // 잠깐 만들어지는 거라면 이름이 없다
				// 여기선 잠깐 생성하는거다   임의적인 사용 , int a 가 있는 순간 전혀 다른 형태가 되는 거가 된다 잠깐동안만 
				public void run() { /*run을 오버라이딩한 클래스*/
					while(true) {
						String msg;
						try {
							msg = dis.readUTF();
							System.out.println(msg);
						} catch (IOException e) {
							System.out.println(socket.getInetAddress() + " 님이 연결이 해제되었습니다.");
							break;
						}
					}
				}
			}.start(); // 이너 클래스   // 익명 이너 클래스 패턴 
			// 수정해선 안됨   하지만 이유는 overriding 할려고 
			// 1회용 
			//th.start();
			while(true) {
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
