package kh_FTPclient;
import java.awt.List;
import java.io.File;
import it.sauronsoftware.ftp4j.FTPClient;
import java.util.Scanner;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;


public class MyFileZila {

	public static int FirstMenu() {
		int choiseNum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Connect FTP server");
		System.out.println("2. Exit Program");
		System.out.print(">>> ");
		try {
			choiseNum = Integer.parseInt(sc.nextLine());
		}catch (Exception e){ // 숫자가 아닌 타입을 넣었을때
			System.out.println("메뉴를 확인해주세요");
			//e.printStackTrace();
		}
		return choiseNum;
	}


	public static int SecondMenu() {
		int choiseNum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Upload File");
		System.out.println("2. Download File");
		System.out.println("3. Disconnect FTP Server");
		System.out.print(">>> ");
		try {
			choiseNum = Integer.parseInt(sc.nextLine());
		}catch (Exception e){ // 숫자가 아닌 타입을 넣었을때
			System.out.println("메뉴를 확인해주세요");
			//e.printStackTrace();
		}
		return choiseNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FTPClient client = new FTPClient();
		int firstMenu=0;
		int secondMenu=0;
		String connetNetAdress = null ;
		int portNumber =0 ;
		String downFile = null ;
		String downFileLocal = null ;
		String ID =null;
		String passWord=null;
		String upFile =null ;
		String FilelList = null ;
		String FilelList2 = null ;
		int FileList3 = 0 ;
		long FileList4= 0;
		int fileHowMany =0 ;
		//client.listNames();
		System.out.println("===FTP Client Program===");
		while(true) {

			firstMenu = FirstMenu();

			switch (firstMenu) {
			case 1:
				System.out.println("Input url");
				System.out.print(">>> ");
				connetNetAdress = sc.nextLine();
				System.out.println("Input Port");
				System.out.print(">>> ");
				try {
					portNumber = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("정확한 포트번호를 입력하세요");
					continue;
				}

				try {
					System.out.println("Try to connet :" + connetNetAdress +"(port : "+portNumber+")");
					client.connect(connetNetAdress, portNumber);	
				}catch (Exception e) {
					System.out.println("Fail --- Exit Program");
					e.printStackTrace();
					continue;
				}

				System.out.println("FTP Server is conneted!");
				while(true) {
					System.out.print("Input ID : ");
					ID = sc.nextLine();
					System.out.println("Input Password : ");
					passWord = sc.nextLine();
					try {
						client.login(ID, passWord);		
						break;
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Wrong Pass Word");
					}
				}
				System.out.println("login success!");
				while(true) {
					secondMenu = SecondMenu();
					switch (secondMenu) {
					case 1:
						System.out.println("Current Directory : /");
						try {
							FTPFile[] list = client.list("*.*");
							for(int i=0; i <list.length ;i++) {
								FilelList = list[i].getName();
								FilelList2 = list[i].getLink();
								FileList3 = list[i].getType();
								FileList4 = list[i].getSize();
								System.out.println(FilelList+" "+FilelList2+" "
										+FileList3+" "+FileList4+" ");
								//System.out.println(list[i]);

							}
						}catch (Exception e) {
							System.out.println("파일목록을 불어올수가 없습니다. ");
							e.printStackTrace();
						}
						System.out.println("Input file's full name you want to upload");
						System.out.print(">>> ");
						upFile = sc.nextLine();
						try {
							client.upload(new File(upFile));;
						}catch (Exception e){
							e.printStackTrace();
							continue;
						}
						System.out.println("파일업로드 완성");
						break;	
					case 2:
						System.out.println("Current Directory : /");
						try {
							FTPFile[] list = client.list("*.*");
							for(int i=0; i <list.length ;i++) {
								FilelList = list[i].getName();
								FilelList2 = list[i].getLink();
								FileList3 = list[i].getType();
								FileList4 = list[i].getSize();
								System.out.println(FilelList+" "+FilelList2+" "
										+FileList3+" "+FileList4+" ");
								//System.out.println(list[i]);
							}
						}catch (Exception e) {
							System.out.println("파일목록을 불어올수가 없습니다. ");
							e.printStackTrace();
							continue;
						}
						System.out.println("Input file's full name you want to download");
						System.out.print(">>> ");
						downFile = sc.nextLine();
						System.out.println("Input path + New Name");
						System.out.print(">>> ");
						downFileLocal = sc.nextLine();
						try {

							client.download(downFile, new File(downFileLocal));
						}catch(Exception e) {
							//e.printStackTrace();
							System.out.println("파일 다운로드에 실패했습니다.");
						}
						System.out.println("파일다운로드 완료");
						break;
					case 3:
						System.out.println("연결을 끊습니다.");
						try{
							client.disconnect (true);
							main(args); // 연결 해재시 메인으로 이동
						}catch (Exception e) {
							System.out.println("연결 끊기에 실패하였습니다.");
						}
						break;
					default:  // 역시 숫자가 아닌 다른거를 입력하였을때 출력
						System.out.println("메뉴를 확인해주세요");
						break;
					}
				}

			case 2:
				System.out.println("Exit Program");
				System.exit(0);
				break;
			default: //1,2 외에 다른 숫자를 집어넣었을때
				System.out.println("Wrong Code  Check Menu List");
				break;
			}

		}
	}

}
