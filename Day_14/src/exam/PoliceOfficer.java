package exam;
// has a
public class PoliceOfficer {
	private Gun gun;
	public PoliceOfficer() {
		this.gun = new Gun();   //<- has a 관계
	}
	public void freeze() {
		// 기능 
		gun.fire();// 필요해서 가져오는 상태   평소에 우리가 하던거
	}
	
	
}
