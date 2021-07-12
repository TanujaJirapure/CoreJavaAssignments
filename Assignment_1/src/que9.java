import java.util.Scanner;

public class que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum=0,rem;
		scanner.nextLine();
		//System.out.println(a);
		while (a != 0) { 
			rem = a % 10; 
			sum = sum + rem; 
			a = a / 10; 
		}
		System.out.println("Sum of the digit is: "+sum);
	}

}
