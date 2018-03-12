package quiz;

public class Quiz_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {15,24,35,99,86,34,13,27,46,66};
		int tmp;
		
		System.out.print("정렬 전 : ");
		for(int i=0;i<arr.length;i++) { // 정렬전 출력
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length-1;i++) { //swamp   
			
			if(arr[i]>arr[i+1]) { // 한번 돌아갈때    
				tmp = arr[i];    // arr.length-1  이걸 왜 썼는가
				arr[i] = arr[i+1]; //
				arr[i+1]= tmp;	
			}
		}// 정렬 1회차
		System.out.println("");
		int count=0;
		for(int i=0;i<arr.length;i++) { // 10회 돌리는 코드	// 여러번만 돌림
			for(int j=0;j<arr.length-1;j++) { //1회 정렬 실행 			
				if(arr[j]>arr[j+1]) { // 결국 나중에 arr[9] arr[10] 비교  //자기 자신를 비교
					tmp = arr[j];    // 이게 버블 
					arr[j] = arr[j+1]; //
					arr[j+1]= tmp;	
					count++;
				}	
			}
			System.out.println("스왑 발생 : "+ count);
			if(count ==0) {
				break;  // 헛바퀴 발생 멈춤
			}
			count =0;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {	
//				if(arr[i] < arr[j]) {         // 이건 전체인데 .? // 이녀석은 select ...?  // arr[0] 일때 한바퀴 돔
//					tmp = arr[j];				// select 정렬 임
//					arr[j] = arr[i];
//					arr[i]= tmp;	
//				}	
//			}
//		}
		
		
		System.out.println(" ");
		System.out.print("정렬 후 : ");
		for(int i=0;i<arr.length;i++) { // 정렬후 출력
			System.out.print(arr[i]+" ");
		}
	}

}
