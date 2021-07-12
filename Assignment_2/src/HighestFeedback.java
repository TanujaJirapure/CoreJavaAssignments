import java.util.Scanner;
public class HighestFeedback {

	public static void main(String[] args) {
		int flag1=1,flag2=1,count=0;	
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the no of elements:");
		int n = scanner.nextInt();
		if(n<0) {
			flag1=0;
			System.out.println("Invalid array size");
		}
		
		if(flag1!=0) {
			int [] arr1 = new int[n];
			int [] arr2 = new int[n];
			int [] arr3 = new int[2*n];
			
			
			//System.out.println("enter elements of arr1:");
			for(int i=0;i<n;i++) {
				arr1[i]= scanner.nextInt();
				if(arr1[i]<=0) {
					flag2=0;
					System.out.println("Invalid input");
					
				}
			}
			
			//System.out.println("enter elements of arr2:");
			for(int i=0;i<n;i++) {
				arr2[i]= scanner.nextInt();
				if(arr2[i]<=0) {
					flag2=0;
					System.out.println("Invalid input");
					
				}
			}
			
			if(flag2!=0) {
				for(int i=0;i<n;i=i+2) {
					if(arr1[i]==arr2[i]) {
						
						arr3[i]=arr1[i];
						arr3[i+1]=arr1[i+1]>arr2[i+1]?arr1[i+1]:arr2[i+1]; 
						
					}
					else {
						
						arr3[i]=arr1[i];
						arr3[i+1]=arr1[i+1];
						arr3[i+2]=arr2[i];
						arr3[i+3]=arr2[i+1];
					}
				}
			}
			
			//System.out.println("Highest feedback is:");
			for(int i=0;i<arr3.length;i++)
				System.out.println(arr3[i]+" ");
			
		}

	}

}
