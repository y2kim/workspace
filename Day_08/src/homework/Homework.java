package homework;

public class Homework {

	public static void main(String[] args) {
		/*
		 * 
		 * */
		int[] lottearr = new int[7];
		int[] lotteAnswer = new int[7];
		int lotte;
		int lottemoney = 1000;
		int how = 0;
		int takemoney =0;
		long totalPay = 0L;
		double per;
		int sameCount =0;
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		int count5 =0;
		int count1money =1000000000;
		int count2money =500000;
		int count3money =100000;
		int count4money =50000;
		int count5money =5000;
		int sumcount1=0;
		int sumcount2=0;
		int sumcount3=0;
		int sumcount4=0;
		int sumcount5=0;
		Boolean Bonus = false;
		// (int)(Math.random()*45+1);
		for(int i=0;i<lotteAnswer.length;i++) {
			lotte = (int)(Math.random()*45+1);
			lotteAnswer[i] =lotte;
			for(int j=0;j<i;j++) {
				if(lotteAnswer[i]==lotteAnswer[j]) {
					i--;
					break;
				}

			}

		}


		while(true) {
			
			for(int j=0;j<lottearr.length;j++) {
				lotte = (int)(Math.random()*45+1);
				lottearr[j] =lotte;
				for(int k=0;k<j;k++) {
					if(lottearr[j]==lottearr[k]) {
						j--;
						break;
					}
				}
			}
			how = how +1;
			System.out.print(how+"번째 구입 로또  :");
			System.out.print("<"+lottearr[0]+"> " +"<"+lottearr[1]+"> "+
					"<"+lottearr[2]+"> "+"<"+lottearr[3]+"> "+"<"+lottearr[4]+"> "+"<"+lottearr[5]+"> ");	

			
			for(int j=0;j<6;j++) {
				if(lotteAnswer[j]==lottearr[j]) {	
					sameCount = sameCount +1;
				}	
			}

			if(lotteAnswer[6]==lottearr[6]) {
				Bonus=true;
			}
			System.out.println("");
			System.out.print("<"+lotteAnswer[0]+"> " +"<"+lotteAnswer[1]+"> "+
					"<"+lotteAnswer[2]+"> "+"<"+lotteAnswer[3]+"> "+"<"+lotteAnswer[4]+"> "+"<"+lotteAnswer[5]+"> ");
			
			
			
			if(sameCount == 6) {
				count1 = count1+1;
				System.out.println("!!!!!!!!!!!!!!!");
				sumcount1 =sumcount1 +count1money;
				System.out.println("<"+lottearr[0]+"> "+"<"+lottearr[1]+"> "+"<"+lottearr[2]+"> "+
						"<"+lottearr[3]+"> "+"<"+lottearr[4]+"> "+"<"+lottearr[5]+">    보너스:"+lottearr[6]);
				System.out.println("=============결산===========");
				System.out.println("1등 총 상금 : "+sumcount1+" 원  당첨횟수 :"+count1+" 회"+"  당첨확률 : "+((double)count1/how));
				System.out.println("2등 총 상금 : "+sumcount2+" 원  당첨횟수 :"+count2+" 회"+"  당첨확률 : "+((double)count2/how));
				System.out.println("3등 총 상금 : "+sumcount3+" 원  당첨횟수 :"+count3+" 회"+"  당첨확률 : "+((double)count3/how));
				System.out.println("4등 총 상금 : "+sumcount4+" 원  당첨횟수 :"+count4+" 회"+"  당첨확률 : "+((double)count4/how));
				System.out.println("5등 총 상금 : "+sumcount5+" 원  당첨횟수 :"+count5+" 회"+"  당첨확률 : "+((double)count5/how));
				System.out.println("총 로또 구매 금액 :"+(long)(lottemoney*how)+" 원");
				System.out.println("합산 :"+(((long)count1money+sumcount2
						+sumcount3+sumcount4+sumcount5)-(lottemoney*how))+" 원");
				System.exit(0);
			} if(sameCount == 5 && Bonus == true) {
				System.out.println(" 2등 당첨 !!!!!!!!!!!!!!!!");
				count2 = count2+1;
				sumcount2 =sumcount2 +count2money;
				sameCount=0;
			} if(sameCount == 5) {
				System.out.println(" 3등 당첨 !!!!!!!!!!!!!!!!");
				count3 = count3+1;
				sumcount3 =sumcount3 +count3money;
				sameCount=0;
			} if(sameCount == 4) {
				System.out.println(" 4등 당첨 !!!!!!!!!!!!!!!");
				count4 = count4+1;
				sumcount4 =sumcount4 +count4money;
				sameCount=0;
			} if(sameCount == 3) {
				System.out.println(" 5등 당첨 !!!!!!!!!!!!!!!  ");
				count5 = count5+1;
				sumcount5 =sumcount5 +count5money;
				sameCount=0;
			} if(sameCount==2){
				System.out.println("  2개일치");
				sameCount=0;
			} if(sameCount==1){
				System.out.println("  1개일치");
				sameCount=0;
			} if(sameCount==0) {
				System.out.println("  전부불일치");
				sameCount=0;
			}
			
			if(how == 10000000) {
				System.out.println("!!!!!!!!!!!!!!!");
				System.out.println("<"+lottearr[0]+"> "+"<"+lottearr[1]+"> "+"<"+lottearr[2]+"> "+
						"<"+lottearr[3]+"> "+"<"+lottearr[4]+"> "+"<"+lottearr[5]+">    보너스:"+lottearr[6]);
				System.out.println("=============결산===========");
				System.out.println("1등 총 상금 : "+sumcount1+" 원  당첨횟수 :"+count1+" 회"+"  당첨확률 : "+((double)count1/how));
				System.out.println("2등 총 상금 : "+sumcount2+" 원  당첨횟수 :"+count2+" 회"+"  당첨확률 : "+((double)count2/how));
				System.out.println("3등 총 상금 : "+sumcount3+" 원  당첨횟수 :"+count3+" 회"+"  당첨확률 : "+((double)count3/how));
				System.out.println("4등 총 상금 : "+sumcount4+" 원  당첨횟수 :"+count4+" 회"+"  당첨확률 : "+((double)count4/how));
				System.out.println("5등 총 상금 : "+sumcount5+" 원  당첨횟수 :"+count5+" 회"+"  당첨확률 : "+((double)count5/how));
				System.out.println("총 로또 구매 금액 :"+(long)(lottemoney*how)+" 원");
				System.out.println("합산 :"+(((long)count1money+sumcount2
						+sumcount3+sumcount4+sumcount5)-(lottemoney*how))+" 원");
				System.exit(0);
			}
		}//while
	}

}
