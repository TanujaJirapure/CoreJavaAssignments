import java.util.Scanner;
public class PrimeIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag1=1,flag2=1,sum=0,count,c1=0;
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter array size:");
		int n = scanner.nextInt();
		if(n<0) {
			flag1=0;
			System.out.println("Invalid array size.");
		}
	
		if(flag1!=0) {
			int [] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scanner.nextInt();
			}
		    
				
			for(int i=1;i<=arr.length;i++) {
				if(i==0)
					continue;
				
				count=0;
				for(int j=1;j<=i;j++) {
					if(i%j == 0)
						count++;
				}
			
			
				if(count==2) {
					sum = sum+arr[i-1];
					c1++;
				}
				
			}
		    System.out.println("sum: "+sum);
		}

	}

}
