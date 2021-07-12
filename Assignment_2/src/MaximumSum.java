import java.util.Scanner;
public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven=0,sumOdd=0,flag1=1,flag2=1;
		
		//System.out.println("Enter the no of elements in an array: ");
		Scanner scanner = new Scanner(System.in);
		int noOfElements = scanner.nextInt();
		if(noOfElements<0) {
			flag1=0;
			System.out.println("Invalid array size");
		}
		
		if(flag1 !=0) {
			//System.out.println("Enter the elements: ");
			int [] arr = new int [noOfElements];
		
			for(int i=0;i<arr.length;i++) {
				arr[i] = scanner.nextInt();
				if(arr[i]<0) {
					flag2=0;
					System.out.println("Invalid input");
					break;
				
				}
			}
		
			if(flag2 != 0) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2 == 0)
						sumEven = sumEven + arr[i];
					else
						sumOdd = sumOdd + arr[i];
				}
		
				if(sumEven < sumOdd)
					System.out.println("maximum sum is of odd elements: "+sumOdd);
				else
					System.out.println("maximum sum is of even elements: "+sumEven);
			
			}
		}
	}

}
