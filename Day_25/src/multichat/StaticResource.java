package multichat;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class StaticResource {
	public static List<DataOutputStream> Clients = new ArrayList<>(); // 대신 소켓의 다른 정보를 가져올수 없다는 정보가 있다 
	// 데이터 아웃풋 스티림 
	synchronized public static void BroadCast(DataOutputStream self , String msg) {
		//퍼포먼스 버림  안정성 얻음 
		List<DataOutputStream> removeList = new ArrayList<>();
		
		for(DataOutputStream tmp: StaticResource.Clients) {
			if(tmp!=self) {
				try {
					//DataOutputStream dos = new DataOutputStream(tmp.getOutputStream()); // 자원을 아낄수가 있다 .
					tmp.writeUTF(msg);
					tmp.flush();
				} catch (Exception e) {
					// TODO: handle exception
					removeList.add(tmp);
					try {
						tmp.close();
					} catch (IOException e1) {
					}
				}
			}
		}
		
		for(DataOutputStream tmp : removeList) {
			Clients.remove(tmp);
		}
	}

	
	
}
