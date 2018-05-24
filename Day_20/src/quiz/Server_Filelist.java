package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server_Filelist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File fileDir = new File("D:\\Act");
		FileFilter onlyFile = new FileFilter() {	
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isFile();
			}
		};
		
		File[] fileList = fileDir.listFiles(onlyFile);
		int filecount = fileList.length;
		List<String> fileName = new ArrayList<>();
		
		for(File fil:fileList) {
			fileName.add(fil.getName());
		}
		DataInputStream[] filesdata = new DataInputStream[filecount];
		
		for(File fil:fileList) {
			int i=0;
			filesdata[i] = new DataInputStream(new FileInputStream(fil));
			i++;
		}
		//byte[] fileContents = new byte[filesdata[2].readInt()]; 
		//filesdata[2].readFully(fileContents);
		
		ServerSocket server = new ServerSocket(8080); 
		System.out.println("서버를 가동했습니다");
		Socket sock = server.accept();
		DataOutputStream dos = new DataOutputStream(sock.getOutputStream());  // 데이터 내보내기 
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		dos.writeInt(filecount);
		dos.flush();
	
		for(int i=0;i<fileName.size();i++) {
			dos.writeUTF(fileName.get(i));
		}
		dos.flush();
		String wantFile = "D:\\Act\\"+dis.readUTF();
		for(int i=0;i<filesdata.length;i++) {
			if(filesdata[i].readUTF().equals(wantFile)) {
				System.out.println("성공");
			}
		}
		
		dis.close();
		dos.close();
		sock.close();
		
		
	}

}

/*
 * 		
 * */
