package exam;

import java.util.Scanner;

//개 , 고양이   :공통 : 다른점  // 부모 : animal
abstract class Animal{
	
	abstract public void bark() ;  // 짓는다는거는 공통사항이다  행동은 공통 내용물 다르다    <- 추상화
		
	
}

class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("월월");
		
	}
	
}

class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("양아치");
		
	}
	
}

class Tiger extends Animal {

	@Override
	public void bark() {
		System.out.println("어흥");
	}
}

class Test {
	public void shout(Animal animal) {
		animal.bark();
	}
}



public class Exam_02 {
	
//	public static void frighten(Cat cat) {
//		cat.bark();
//	}
//	public static void frighten(Dog dog) {
//		dog.bark();
//	}
	public static void frighten(Animal animal) {
		animal.bark(); //<-사용자가 어떤 기능을 넣을지 모르니 사용하는것 
		//((Tiger)animal).bark();  //<- 갯수대로 생성하고 if 쳐져야 해야한다.
	}
	
	public static void main(String[] args) {
		//Animal a = new Animal() ; //  Animal 인스턴스화 할수 없습니다  라고 오류
		Scanner sc = new Scanner(System.in);
		Animal a;
		//a = parseAnimal(sc.nextLine());
		//Integer.parseInt(s)
		Test bakbak = new Test();
		Cat cat = new Cat();
		cat.bark();
		Dog dog = new Dog();
		dog.bark();
		Tiger tiger = new Tiger();
		frighten(cat);
		frighten(dog);
		frighten(tiger);
		bakbak.shout(cat);
	}

	

//	public static Animal parseAnimal(String str) throws Exception {
//		Animal a ;
//		if (str == null)  {
//            throw new Exception("null");
//        }
//		a = str ;
//		return a;
//	}
}
