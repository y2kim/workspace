package kh_FTPclient;

import java.io.File;

import it.sauronsoftware.ftp4j.FTPClient;
public class FileZilea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FTPClient client = new FTPClient();

		try {
			client.connect("192.168.20.3", 21);
			System.out.println("접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		try {
			client.login("java","1234");
			System.out.println("로그인 성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("아이디 또는 패스워드가 잘 못 되었습니다.");
			System.exit(0);
		}

		try {
			client.download("오늘의미션.txt", new File("다운성공.txt"));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("파일 다운로드에 실패했습니다.");
		}

		try {
			client.disconnect(true);
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

}
