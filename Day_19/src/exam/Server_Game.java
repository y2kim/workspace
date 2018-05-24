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

public class Server_Game {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(8080); //
		System.out.println("서버를 가동했습니다");
		HashMap<Integer,String> gababo = new HashMap<>();
		List<Socket> player = new ArrayList();
		List<DataOutputStream> dos =new ArrayList<>();
		List<DataInputStream> dis =new ArrayList<>();
		Socket socket = null;
		int roading =0;
		int count =0;
		while(true) {
			 roading = 0;
			while(roading < 2) {
				socket =server.accept(); 
				player.add(socket);
				System.out.println("플레이어 " + (player.indexOf(socket) + 1) + " 님이 연결했습니다.");
				dos.add(new DataOutputStream(socket.getOutputStream()));
				dis.add(new DataInputStream(socket.getInputStream()));
				roading ++;	
			}
			gababo.put(1, "가위");
			gababo.put(2, "바위");
			gababo.put(3, "보");

			for(int i=0;i<player.size();i++) {
				dos.get(i).writeUTF((i+1)+" 번째 플레이어 ");
				dos.get(i).writeUTF("1.가위 2.바위 3.보 ");
				dos.get(i).flush();
			}
			int input1 = dis.get(0).readInt();
			int input2 = dis.get(1).readInt();
			String score = "aa";

			if(input1 == 1 ) { // 1가위2바위3보
				if(input2 ==1) {
					System.out.println("비겼습니다..");
					score="비겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else if(input2 ==2) {
					System.out.println("2플레이어가 이겼습니다..");
					score="2플레이어가 이겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else if(input2 ==3) {
					System.out.println("1플레이어가 이겼습니다..");
					score="1플레이어가 이겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else {
					System.out.println("2플레이어가 이상한 값을 냈습니다.");
					score = "2플레이어가 이상한 값을 냈습니다";
				}
			}else if(input1 == 2 ) {
				if(input2 ==1) {
					System.out.println("1플레이어가 이겼습니다..");
					score="비겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else if(input2 ==2) {
					System.out.println("비겼습니다..");
					score="1플레이어가 이겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else if(input2 ==3) {
					System.out.println("2플레이어가 이겼습니다..");
					score="2플레이어가 이겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else {
					System.out.println("2플레이어가 이상한 값을 냈습니다.");
					score = "2플레이어가 이상한 값을 냈습니다";
				}
			}else if(input1 == 3 ){
				if(input2 ==1) {
					System.out.println("2플레이어가 이겼습니다..");
					score="2플레이어가 이겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else if(input2 ==2) {
					System.out.println("1플레이어가 이겼습니다..");
					score="1플레이어가 이겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else if(input2 ==3) {
					System.out.println("비겼습니다..");
					score="비겼습니다"+gababo.get(input1)+":"+gababo.get(input1);
				}else {
					System.out.println("2플레이어가 이상한 값을 냈습니다.");
					score = "2플레이어가 이상한 값을 냈습니다";
				}
			}else{
				if(input2 ==1) {
					System.out.println("1플레이어가 이상한 값을 냈습니다.");
					score = "1플레이어가 이상한 값을 냈습니다";
				}else if(input2 ==2) {
					System.out.println("1플레이어가 이상한 값을 냈습니다.");
					score = "1플레이어가 이상한 값을 냈습니다";
				}else if(input2 ==3) {
					System.out.println("1플레이어가 이상한 값을 냈습니다.");
					score = "1플레이어가 이상한 값을 냈습니다";
				}else {
					System.out.println("두명의플레이어가 이상한 값을 냈습니다.");
					score = "두명의 플레이어가 이상한 값을 냈습니다";
				}
			}

			int deluser =0;
			for(int i=0;i<player.size();i++) {
				dos.get(i).writeUTF(score);
				dos.get(i).flush();
				deluser++;
				
			}
			while(deluser>0) {
				deluser--;
				dos.remove(deluser);  // 자동으로 땡껴짐 
				dis.remove(deluser);
				player.remove(deluser);
			}
			
		}
	}
}


