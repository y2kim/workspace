package exam;

public class Exam_06 {

	public static void func(int[]/*배열의 주소값*/ numarr) {// 
		numarr/*arr의 1만큼 떨어진 지점(주소)*/[1] =20; //[10][20][3][4]
		/*
		 메인 펑션 , 펑션 이라는 것이 값을 공유  : 주소 때문에
		 펑션에서 값 조작해서 메인이 값 변동됨
		 */
	}
	
	public static void main(String[] args) {
		// // call by reference 는 다름     중요한 이유 :  리턴 없이도 값을 공유    
		// 값 하나를 서로 메서드을 통해 이용할려고 
		/*
		메인 보다   다른 메소드가 매우 어마머아하게 매우 매우 커다
		
		[1]				[main]			  				[8]
				[2]		[4]						[7]
		[3]			[5]				[6]
		
		메인 보다 바같 코드가 많고    통신 하듯이 해야함 
		call by reference  : 리턴 없이도 값을 공유 
		*/
		int[] arr /*여기 까지는 배열의 주소를 저장할 변수 // */ = new/*리턴 함 1000(주소임)*/ int[] {1,2,3,4};// // 참조형  
		/*
stack		[main(arr)		]  arr: int형 배열 		
			[		]								
heap		[		]
			[		]
			------
			[		]
			[		]
			[	{-1000번지-[1][2][3][4]}	]
			[		]
		*/
		arr[0] =10 ;//1000번지에서 떨어진 점    // 1번째 칸에 10을 집어넣음 
		System.out.println(arr[0]);
		func(arr);/*
		[func(arr)]
		[		]
		[		]
		[		]
		*/
		System.out.println(arr[1]);
	}

}
