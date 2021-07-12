import java.util.Scanner;
public class RepeatedSalaryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag1 =1,flag2=1, count=1;
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Enter the no of elements in an array");
		int noOfElements = scanner.nextInt();
		if(noOfElements<0) {
			flag1=0;
			System.out.println("Invalid input");		
		}
		
		if(flag1 != 0) {
		int [] arr = new int [noOfElements];
		//System.out.println("enter the elemnts");
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid input");
				flag2=0;
				break;
			}
			
		}
		if(flag2 != 0) {
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(key==arr[j]) {
					count++;
					break;
				}
				
			}
			
		}
		System.out.println("Count is:"+count);
		}
		}
	}

}

