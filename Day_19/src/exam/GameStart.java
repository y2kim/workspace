package exam;

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

public class GameStart  {
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8080); //  //1~65535  // 1~1024 : Well KNOWN : 이미 알려진 번호 
		System.out.println("서버를 가동했습니다");
		HashMap<Integer,String> gababo = new HashMap<>();
		List<Socket> player = new ArrayList();
		int count =0;
		Socket socket =server.accept(); 
		OutputStream out = socket.getOutputStream();// 기초 아웃풋 연결   
		DataOutputStream  dos = new DataOutputStream(out); // 확장  // 스트림오픈
		
		
while(true){
			
			player.add(socket);
			//int playcount = 1;
			String players = player.get(count).toString();
			gababo.put(count, players);
			count++;
			System.out.println(count + "번째 플레이어 입장 ");
			dos.writeUTF(count + "번째 플레이어 입장   >>> 뜰때까지 대기 해주세요");
			dos.flush();
			//playcount++;
			//player.get(0);
			

				Scanner sc = new Scanner(System.in);
				System.out.println("2명이 입장");
				dos.writeUTF("가위 바위 보 서버 시작");
				dos.writeUTF("1.가위 2.바위 3.보 ");
				dos.writeUTF(">>>>>");
				dos.flush();
				
//				dos.writeUTF(" 1 Player >>>");
//				dos.flush();
				InputStream in = player.get(0).getInputStream();
				DataInputStream dis = new DataInputStream(in);
				int choice = dis.readInt();
				System.out.println(choice);
//				dos.writeUTF(" 2 Player >>>");
//				dos.flush();
				InputStream in2 = player.get(1).getInputStream();
				DataInputStream dis2 = new DataInputStream(in2);
				int choice2 = dis2.readInt() ;
				System.out.println(choice2);
				
				//String msg = dis.readUTF(); // 데이터 정보를  받음 
				//System.out.println(socket.getInetAddress() +" to " +  msg);
				if(choice ==1) { //1  2바위  3 보
					
					
					if(choice2 == 1) {
						dos.writeUTF("비겼습니다.");
						dos.flush();
					}else if(choice2 == 2) {
						dos.writeUTF("2번플레이어가  이김.");
						dos.flush();
					}else if(choice2 == 3) {
						dos.writeUTF("1번플레이어가  이김.");
						dos.flush();
					}else {
						dos.writeUTF("2번플레이어가  이상한 숫자 냄.");
						dos.flush();
					}
					
				
				}else if(choice ==2) {//1  2바위  3 보
//					InputStream in2 = player.get(1).getInputStream();
//					DataInputStream dis2 = new DataInputStream(in2);
					//int choice2 = dis2.readInt() ;
					if(choice2 == 1) {
						dos.writeUTF("1번 플레이어가 이김");
						dos.flush();
					}else if(choice2 == 2) {
						dos.writeUTF("비겼습니다.");
						dos.flush();
					}else if(choice2 == 3) {
						dos.writeUTF("2번플레이어가  이김.");
						dos.flush();
					}else {
						dos.writeUTF("2번플레이어가  이상한 숫자 냄.");
						dos.flush();
					}
					
				}else if(choice ==3){//1  2바위  3 보
//					InputStream in2 = player.get(1).getInputStream();
//					DataInputStream dis2 = new DataInputStream(in2);
					//int choice2 = dis2.readInt() ;
					if(choice2 == 1) {
						dos.writeUTF("2번플레이어가 이김");
						dos.flush();
					}else if(choice2 == 2) {
						dos.writeUTF("1번플레이어가  이김.");
						dos.flush();
					}else if(choice2 == 3) {
						dos.writeUTF("비겼습니다");
						dos.flush();
					}else {
						dos.writeUTF("2번플레이어가  이상한 숫자 냄.");
						dos.flush();
					}
					
					
				}else {
					System.out.println("1,2,3 번중 다시 선택해주세요");
					dos.writeUTF("1,2,3 번중 다시 선택해주세요");
					dos.flush();
				}


		}
	}

}
