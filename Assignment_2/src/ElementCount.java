import java.util.Scanner;
public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag1=1,flag2=1,count=0;
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the size of array:");
		int n = scanner.nextInt();
		
		if(n<0) {
			System.out.println("Invalid input");
			flag1=0;
		}
		if(flag1!=0) {
			int [] arr=new int[n];
			//System.out.println("Enter the array elements: ");
			for(int i=0;i<n;i++) {
				arr[i]=scanner.nextInt();
				if(arr[i]<0) {
					flag2=0;
					System.out.println("Invalid input");
					break;
				}
			}
			if(flag2!=0) {
				//System.out.println("Enter the element to be counted:");
				int element = scanner.nextInt();
				for(int i=0;i<n;i++) {
					if(arr[i]==element)
						count++;
				}
				System.out.println("The count of the element is: " +count);
			}
			
		}

	}

}
