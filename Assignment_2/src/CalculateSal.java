import java.util.Scanner;
public class CalculateSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter Salary:");
		int salary = scanner.nextInt();
		if(salary > 8000)
			System.out.println("Salary too large");
		else if(salary < 0)
			System.out.println("Salary too small");
		else {
			//System.out.println("Enter Shifts:");
			int shifts = scanner.nextInt();
			if (shifts<0)
				System.out.println("Shifts too small");
			else {
				double rem = salary - 0.5*salary + 0.02*salary*shifts;
				System.out.println("Remaining salary is: "+ rem);
			}
		
		}
			

	}

}
