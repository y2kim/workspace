package multichatting;
import java.io.DataInputStream;
// 눈에 보이지 않는 scope 계산 까지 해야함 
import java.net.Socket;

public class ClentThread extends Thread{
	private Socket sock;
	
	
	public ClentThread(Socket sock) {
		this.sock = sock;
	} 
	
	@Override
	public void run() {
		try (DataInputStream dis = new DataInputStream(this.sock.getInputStream())){
			System.out.println(sock.getInetAddress() +" 접속 ");
			String msg =dis.readUTF();
			System.out.println(sock.getInetAddress() +" : "+msg);
		} catch (Exception e) {
			System.out.println(sock.getInetAddress() +" 연결 해제 ");
		}
	}
	
	public Socket getSock() {
		return sock;
	}
	public void setSock(Socket sock) {
		this.sock = sock;
	}
}
