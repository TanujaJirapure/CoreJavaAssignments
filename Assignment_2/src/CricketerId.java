import java.util.Scanner;
public class CricketerId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag1=1,flag2=1;
		
		Scanner scanner = new Scanner(System.in);
	//	System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		if(n<0) {
			flag1=0;
			System.out.println("Invalid input");
		}
		if(flag1!=0) {
		//	System.out.println("Enter the index and score: ");
			int [] arr = new int[n];
		
			for(int i=0;i<arr.length;i++) {
				arr[i]= scanner.nextInt();
				if(arr[i]<=0) {
					flag2=0;
					System.out.println("Invalid score");
				}
			}
			if(flag2!=0) {
			//	System.out.println("Enter the given score value: ");
				int givenScore = scanner.nextInt();
		
				//System.out.println("Id of cricketer having score greater than given score: ");
				for(int i=1;i<arr.length;i=i+2) {
					if(arr[i]>givenScore)
						System.out.println(arr[i-1]);
				}
			}
		
		}
	}

}
