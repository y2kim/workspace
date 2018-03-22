package exam; // 특이

import java.util.Scanner;

public class noninstruck_Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv2 lg = new Tv2(10,20);  // 불려지는 타이밍임  생성자가     인스턴스가 불려지는때가  (자동호출) 
		// 인스턴스가 만들어지는 타이밍이기 때문에(이때 값을 넣어짐) 초기값 집어넣기 편리함   1번째 방법
		// 특이함   setter 대신 값 넣을때  채널과 볼륨
		/*Tv2 lg = new Tv2(10,20); : 생성자에 매개변수 없어서  
		 * 
		 * */
		
		//lg.setChannel(20);
		//lg.setVolume(5); 
		
		/*  언제든 값을 넣는 역활    2번째 방법
		 * lg.setChannel(20);
		   lg.setVolume(5); 
		 * */
		// <- Construct   호출
		// 편하게 집어넣기   Construct !특이한![필수아님] 
		//Construct  : 메소드의 일종 (메소드 호출) 하고 관계 있음
		/*
		 * protected : 아직
		 * 
		 * package: 중간에 껴있는 애  퍼블릭과 프로텍티드 사이
		 * */
		//lg.Tv2;
		// 값 집어넣을  일일이 집어넣을수 없으니 방법
		
		Scanner sc = new Scanner/*인스터스*/(/*인수값*/System.in);
		lg.brand = "";
	}

}
