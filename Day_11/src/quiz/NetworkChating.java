package quiz;

/*객체지향 초급문법
 * -정보은닉 ,Getter/Setter,Constructor,static
 * 객체지향 중급문법
 * -상속,다형성,추상화
 * */

public class NetworkChating {
// chatting  이게 맞는 스펠링 
	private String nickName;
	private	String networkAdress;
	private String textMessage;
	private String textMessage2;
	
	public String getTextMessage2() {
		return textMessage2;
	}
	public void setTextMessage2(String textMessage2) {
		this.textMessage2 = textMessage2;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNetworkAdress() {
		return networkAdress;
	}
	public void setNetworkAdress(String networkAdress) {
		this.networkAdress = networkAdress;
	}
	public String getTextMessage() {
		return textMessage;
	}
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
	String sendMessage(String textMessage , String nickName) {
		this.textMessage = textMessage;
		this.nickName = nickName;
		String result1 = this.textMessage;
		String result2 = this.nickName;
		String result3 = result1+","+result2;
		return result3;
	}
	String takeMessage(String textMessage2) {
		return this.textMessage2;
	}
	String netConnet(String netstr) {
		return netstr;
	}
	
}
