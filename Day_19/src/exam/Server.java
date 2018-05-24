package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Server {
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8080); //  //1~65535  // 1~1024 : Well KNOWN : 이미 알려진 번호 
		// 두번 눌르면 소켓 사용하고 있다면서 에러남 
		System.out.println("서버를 가동했습니다");
		// server.accept(); //무한루프(연결되기전/ 까지) : 사실상 CHECK  // 여러명 상대   // <-  클라이언트가 실행되면 일단은 지워짐 
		
			
		
		Socket socket =server.accept(); 
		System.out.println(socket.getInetAddress() + " 연결");
		OutputStream out = socket.getOutputStream();// 기초 아웃풋 연결   
		//out.write(b);// <- 너무 기본적이라 사용안함  // 프로토타입 
		DataOutputStream  dos = new DataOutputStream(out); // 확장  // 스트림오픈
		//dos.writeUTF("기본적으로 사용하는 유니코드는 : UTF-8"); // UTF 방식으로 전달
	
		//InputStream in = socket.getInputStream();
		//DataInputStream dis = new DataInputStream(in);
		//dos.write
		// 데이터 보내겠다는 명령 , 데이터를 단순적재 , 발송 X 
		while(true){
		dos.writeUTF(JOptionPane.showInputDialog("그래픽"));
		dos.flush();// 데이터 출발
		//String msg = dis.readUTF(); // 데이터 정보를  받음 
		//System.out.println(msg);
		}
		
		//dos.close(); // 마지막은 항상 클로즈 해줘야함 
		// 연결 요청 들어옴  
		
		
	}
}
