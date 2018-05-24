package multichatting;

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
// 자원 변환 및 문제가 생김 
// 자원 공유 문제가 생김 
public class Server {
	public static void main(String[] args) throws Exception {
		try {
			ServerSocket server = new ServerSocket(8000);
			System.out.println("서버를 가동했습니다");
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				Socket socket =server.accept();
				ClentThread ct = new ClentThread(socket);
				ct.start();
			}
			
			
		    // 이너 클래스   // 익명 이너 클래스 패턴 
			// 수정해선 안됨   하지만 이유는 overriding 할려고 
			// 1회용 
			//th.start();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
