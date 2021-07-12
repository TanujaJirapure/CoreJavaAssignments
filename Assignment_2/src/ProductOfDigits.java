import java.util.Scanner;
public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,amount=1,flag=1;
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the travelled distance: ");
		int distance = scanner.nextInt();
		if(distance <0 || distance> 32767) {
			flag=0;
			System.out.println("Invalid input");
		}
		if(flag!=0) {
			while(distance>0) {
				rem = distance%10;
				amount = amount*rem;
				distance = distance/10;
			
			}
			System.out.println("The amount obtained is:"+amount);
		
		}
	}

}
