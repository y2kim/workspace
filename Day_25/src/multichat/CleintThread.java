package multichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CleintThread extends Thread {
	private Socket sock;

	public CleintThread(Socket sock) {
		this.sock = sock;
		//StaticResource.Clients.add(sock);  // 다른 사람들에게 대화를 전달시킬려면  저장해야할 구간이 필요함 
	}
	DataInputStream dis = null;
	DataOutputStream dos = null;
	@Override
	public void run() {
		try {
			System.out.println(sock.getInetAddress()+"입장하였습니다.");
			this.dis = new DataInputStream(sock.getInputStream());
			this.dos = new DataOutputStream(sock.getOutputStream()) ;  // in out
			StaticResource.Clients.add(this.dos);
			while(true) {
				String msg = dis.readUTF();
				//소켓 dos dis 전부 몽땅 담아버린다
				StaticResource.BroadCast(dos ,msg);  
//	--			for(Socket tmp: StaticResource.Clients) {  // 모든 사람들에게 전체 한바퀴  // 포문에선 중간에 빠지는현상은 좋지 않다
//					if(tmp == null) {
//						StaticResource.Clients.remove(tmp);
//						System.out.println(sock.getInetAddress()+"퇴장하였습니다.");
//					}
//					if(!(tmp == sock)) { // 내가 꺼낸 소켓이  일치 하지않고   메세지 전달
//						System.out.println(tmp.getInetAddress() + " 님에게 발송");
//						DataOutputStream tmpdos = new DataOutputStream(tmp.getOutputStream());
//						try {
//							tmpdos.writeUTF(msg);
//							tmpdos.flush();
//						} catch (Exception e) { // 동시성 오류   1알고리즘 , 2 동시성 컬랙션 
//						}
//					}
//					
//				}--
			}
		} catch (Exception e) {
			try {
				this.dis.close();
				this.dos.close();
			} catch (IOException e1) {}
		}
	}

}
