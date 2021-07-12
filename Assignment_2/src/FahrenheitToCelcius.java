import java.util.Scanner;
public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=1;
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter temperature in fahrenheit: ");
		int temp_in_F = scanner.nextInt();
		if(temp_in_F <0) {
			flag=0;
			System.out.println("Invalid input");
		}
		if(flag !=0) {
		float temp_in_C = (temp_in_F - 32) * 5/9f;
		String str = String.format("%.02f", temp_in_C);
		System.out.println("equivalent centigrade temperature is :" +str);
		}
	}

}
