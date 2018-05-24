package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Server_02 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8080); //  //1~65535  // 1~1024 : Well KNOWN : 이미 알려진 번호 
		Scanner sc = new Scanner(System.in);
		System.out.println("서버를 가동했습니다");
		
		Socket socket =server.accept(); 
		System.out.println(socket.getInetAddress() + " 연결");
		OutputStream out = socket.getOutputStream();// 기초 아웃풋 연결   
		DataOutputStream  dos = new DataOutputStream(out); // 확장  // 스트림오픈
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
	
		while(true){
		String msg = dis.readUTF(); // 데이터 정보를  받음 
		System.out.println(socket.getInetAddress() +" to " +  msg);
		if(msg.equals("time")) {
			dos.writeUTF(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			dos.flush();
		}else if(msg.equals("lotto")) {
			int[] arrs = new int[7];
			for(int i=0;i<arrs.length;i++) {
				int random = (int)(Math.random()*45+1);
				arrs[i] = random;	
			}
			String numarr = arrs[0]+" "+arrs[1]+" "+arrs[2]+" "+arrs[3]+" "+arrs[4]+" "+arrs[5]+" "+arrs[6];
			dos.writeUTF(numarr);
			dos.flush();
		}else {
			System.out.print("채팅 : ");
			dos.writeUTF("제가 채팅 칩니다~");
			String str = sc.nextLine();
			dos.writeUTF(str);
			dos.flush();
		}
		
		
		}
		
	}

}

