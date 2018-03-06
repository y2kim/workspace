package quiz;

public class Quiz_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;

		System.out.println("0=================");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print("☆");			
			}
			System.out.println();
		}	
		System.out.println("1=================");	
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("☆");			
			}
			System.out.println();
		}
		System.out.println("2=================");	
		for(i=1;i<=5;i++) {
			for(j=5;j>=i;j--) {
				System.out.print("☆");			
			}
			System.out.println();
		}
		System.out.println("3=================");	
		for(i=5;i>=1;i--)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("    ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println("4=================");	
		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("    ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("☆");
			}
			System.out.println();
		}

	}

}
