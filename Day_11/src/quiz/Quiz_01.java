package quiz;
import exam.Tv;
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NetworkChating netChat = new NetworkChating();
		Tv lg = new Tv();
		String netAd = "0.0";
		String nickName = "aaa";
		netChat.networkAdress = netAd;  // 주소값 받음
		netChat.netConnet(); // 주소 연결하는 기능
		netChat.nickName = netAd; // 닉넴
		netChat.textMessage = "anyThing"; // 보낼 메세지
		netChat.sendMessage(); // 주고
		netChat.takeMessage(); // 받고
	}

}
