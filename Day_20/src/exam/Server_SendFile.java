package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Server_SendFile {
//순서 컴퓨터   램  하드웨어   1.하드웨어 접근 FileStream
	// 기준 램  : Input 임  byte[] 로 전송  2. 나는 상대방한테 out 3. 상대방은 Im
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File files = new File("D:\\Act\\MA.jpg"); 
		FileInputStream fis = new FileInputStream(files);
		DataInputStream dis =new DataInputStream(fis);
		byte[] fileContents = new byte[(int)files.length()]; // 사이즈 정보 문제 : files.length 로 ㄱ ㄱ
		dis.readFully(fileContents);
		// 대괄호는 int 형밖에 안들어감   // 대형은 쪼개서 ...
		//-----하드웨어에서  파일 꺼내는 작업
		
		//-----------이제 상대방 에게 연결 
		ServerSocket server = new ServerSocket(8080); //  //1~65535  // 1~1024 : Well KNOWN : 이미 알려진 번호 
		// 두번 눌르면 소켓 사용하고 있다면서 에러남 
		System.out.println("서버를 가동했습니다");
		Socket sock = server.accept();
		DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
		
		dos.writeLong(files.length());
		dos.flush();
		
		dos.write(fileContents);
		dos.flush();
		
		dos.close();
		dis.close();
		sock.close();
		fis.close();
	}

}
