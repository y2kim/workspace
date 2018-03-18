package kh_webclient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class Cudio {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String 
		URL myurl = new URL("http://comic.naver.com/webtoon/weekday.nhn");
		HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
		// 시큐어 
		//https  ? 왜 안되지?
		// 이클립스 코드로 받음 
		// 내요을 꺼낼 필요가 있다
		String[] AllLine = new String[7000];
		Scanner sc = new Scanner(con.getInputStream(),"utf8");   
		// . 찍으면 static ()안 붙으면 필드 붙으면 메서드   
		//in(표준입력) 입력밭는 방향
		//System sys32 = new System;
		//con.setRequestMethod("GET");
		// \": 문자그대로의 더블쿼테이션으로 읽겠다.
		// 스플릿으로 자를수 있다   -> 다른방법으로는 정규표현식
		//String[] scr = line.split("tultip>\"");
		int i=0;
		while(true) {  // 웹에서 받아온 소스르 배열에 모두 저장하는 코드
			String line=null;
			try {
				line = sc.nextLine();
				AllLine[i++] = line;
				
			}catch (Exception e) {
				System.out.println("끝남");
				break;
			}

//			if(line.contains("class=\"title\" title=\"")) {
//				System.out.println(line.split("<div class=\"hanja_tultip\">")[1].split("</div>")[0]);
//			}
		}
		// 단순 배열담기
		for(int j=0;j < i;j++) {
			if(AllLine[j].contains("class=\"title\" title=\"")) {
				//System.out.println(AllLine[j-10]);
				if(AllLine[j-10].contains("ico_updt")) {
					System.out.println(AllLine[j].split("title=\"")[1].split("\">")[0]);
				}	
			}
		}
		
		con.disconnect();
		// HTML 소스를 다 읽는다.
		// 코드가 서로 달라서 글씨가 깨진다.


	}

}
