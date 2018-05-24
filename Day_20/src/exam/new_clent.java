package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class new_clent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket client = new Socket("192.168.20.3",30500); // 접속 시도 
		System.out.println("접속 시도");
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		List<DataInputStream> ins = new ArrayList<>();
		List<DataOutputStream> outs = new ArrayList<>();
		
		
//			InputStream in = client.getInputStream();
//			DataInputStream dis = new DataInputStream(in); // 확장
//			OutputStream out = client.getOutputStream();
//			DataOutputStream  dos = new DataOutputStream(out); 

			ins.add(new DataInputStream(client.getInputStream()));
			outs.add(new DataOutputStream(client.getOutputStream()));
			System.out.println("어디야 ?");
			
			int msg2 = ins.get(0).readInt(); // 데이터 정보를  받음 
			System.out.println(msg2);
			//---발신
			int str = Integer.parseInt(sc.nextLine());
			outs.get(0).writeInt(str);
			outs.get(0).flush();
			//----수신
			
//			int count = ins.get(0).readUTF().length();
//			System.out.println(count);
			
			for(int i=0;i<3;i++) { // 내가 사이즈 값은 알수 없으니 i는 3으로 할수밖에 없음  것보다 utf 리드 배열 은 그게 아님
				list.add(ins.get(0).readUTF()); // 한줄에 한번밖에 못받음  // 스트링형으로 밭기 때문에  일반 스트링으로 받아도 된다 
				System.out.println(list.get(i));
			}
		
			int msg3 = ins.get(0).readInt(); // 데이터 정보를  받음 
			System.out.println(msg3);
			byte[] barr = new byte[msg3];// 바이트 배열도 이진수 
			List<Byte> Bytearr = new ArrayList<>(); // 사이즈 , 배열내용
			//ins.get(0).readFully(b);
			// 리드 풀리 값을 받을수 있으나 오직 바이트 배열을 가져야함   어디에 담을거냐는 목적임 
			ins.get(0).readFully(barr);
			//
			for(int i=0;i<msg3;i++) {
				//ins.get(0).readFully(Bytearr.get(i));
				System.out.println(barr[i]);
			}
			
			
			for(int i=0;i<7;i++) {
				Bytearr.add(ins.get(0).readByte());
				
				System.out.println(Bytearr.get(i));
			}
			
			//System.out.println(Bytearr.get(0));
			
//			String msgs2 = dis.readUTF();
//			System.out.println(msgs2);
//			String msgs3 = dis.readUTF();
//			System.out.println(msgs3);
			
//			int msg2 = dis.readInt(); // 데이터 정보를  받음 
//			System.out.println(msg2);
//			String str = sc.nextLine();
//			dos.writeUTF(str);
		
			
	}

}
