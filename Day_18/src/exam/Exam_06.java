package exam;

import java.util.HashMap;
import java.util.Map;

public class Exam_06 {

	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap(); // 키와 값을 가지고 있다     <K,V>Entry
		map.put("Hello",1);
		map.put("Java",2);
		map.put("Good",3);
		map.put("Hello", 4);
		//나중에 들어온놈이 먼저 들어온놈을 빼간다
		//System.out.println(map); // 전체 출력
//		System.out.println(map.get("Hello"));
//		System.out.println(map.keySet());//키값만 튀어나옴
//		System.out.println(map.values());//value 값이 튀어나옴
		//"Key = set " 중복을 방지하며  똑같은 값을 가질수 없다 
		// value 는  중복을 허용하며 Key의 순서를 따름 
		Map<String , String> has = new HashMap(); 
		String str =  "Java Hello Good";
		String str2 =  "Exam auo eee";
//		while(has.size() < 3) {
//			has.put(str, str2);
//		}
		// 대량데이터 검색 ,  어떤 키에 관하여 
		has.put("Java", "Exam");
		has.put("Hello", "pratice");
		has.put("Good", "Synmopny");
		
		for(String key:map.keySet()) {
			System.out.println(key + " : " + has.get(key));
		}

		Map<String , String> hass = new HashMap(); 
	}

}
