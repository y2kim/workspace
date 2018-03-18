package quiz;
import exam.Tv;
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NetworkChating netChat = new NetworkChating();
		Tv lg = new Tv();
		String netAd = "0.0";
		String nickName = "aaa";
		//netChat.networkAdress = netAd;  // 주소값 받음
		netChat.setNetworkAdress(netAd); // 네트워크 주소
		netChat.netConnet(netChat.getNetworkAdress()); // 주소 연결하는 기능
		//netChat.nickName = netAd; // 닉넴
		//netChat.textMessage = "anyThing"; // 보낼 메세지
		netChat.setNickName(nickName);
		netChat.setTextMessage("what"); 
		netChat.sendMessage(netChat.getTextMessage(),netChat.getNickName()); // 메세지와 닉네임  둘다 받음
		netChat.takeMessage(netChat.getTextMessage2()); // 받는다는 가정하예
	}

}
