package kh_webclient;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class MainWebs {

	//private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String 
		URL myurl = new URL("http://dic.naver.com/");
		HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
		// 시큐어 
		//https  ? 왜 안되지?
		// 이클립스 코드로 받음 
		// 내요을 꺼낼 필요가 있다
		Scanner sc = new Scanner(con.getInputStream(),"utf8");   
		// . 찍으면 static ()안 붙으면 필드 붙으면 메서드   
		//in(표준입력) 입력밭는 방향
		//System sys32 = new System;
		//con.setRequestMethod("GET");
		// \": 문자그대로의 더블쿼테이션으로 읽겠다.
		// 스플릿으로 자를수 있다   -> 다른방법으로는 정규표현식
		//String[] scr = line.split("tultip>\"");
		while(true) {
			String line=null;
			try {
				line = sc.nextLine();
				
			}catch (Exception e) {
				System.out.println("끝남");
				break;
			}

			if(line.contains("<div class=\"hanja_tultip\">")) {
				System.out.println(line.split("<div class=\"hanja_tultip\">")[1].split("</div>")[0]);
			}
		}
		con.disconnect();
		// HTML 소스를 다 읽는다.
		// 코드가 서로 달라서 글씨가 깨진다.

	}



}
