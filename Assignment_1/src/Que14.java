import java.util.Scanner;
public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the no: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a=n;
		int rem,sum=0;
		while (n != 0) { 
			rem = n % 10; 
			sum = sum + (rem*rem*rem); 
			n = n / 10; 
		}
		if(sum == a	)
			System.out.println("Number is armstrong.");
		else
			System.out.println("Number is not armstrong.");
	}

}
