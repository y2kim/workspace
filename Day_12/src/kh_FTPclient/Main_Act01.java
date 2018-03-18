package kh_FTPclient;

import java.util.Scanner;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;

import java.io.File;
import java.io.IOException;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


public class Main_Act01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		FTPClient client = new FTPClient();
		String mainNetAdress ;
		String downFile ;
		String downLocation;
		String upFile ;
		
		try {
			client.connect("192.168.20.3", 21);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 鍮④컙硫붿꽭吏� �쑉�뒗嫄� 蹂댁뿬�떖�씪 
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (FTPIllegalReplyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (FTPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		
		try {
			client.login("java", "1234");
			System.out.println("로그인 성공");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (FTPIllegalReplyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (FTPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		
		//downFile = sc.nextLine();
		try{
		client.download("오늘의미션.txt", new File("미션성공.txt"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
		}
		//client.upload(file, listener);
//		try {
//		client.upload(new File("f"));
//		}catch (Exception e){
//			e.printStackTrace();
//		}
		
		try {
			client.disconnect(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} 
		
	}

}
