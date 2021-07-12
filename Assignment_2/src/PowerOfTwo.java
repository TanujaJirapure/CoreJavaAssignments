import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		int flag1=1,flag2=1;
		if(n<0) {
			System.out.println("Number too small");
			flag1=0;
		}
		else if(n>32767) {
			System.out.println("Number too large");
			flag1=0;
		}
		if(flag1!=0) {
			while (n > 1 && n !=0){
	            if (n % 2 != 0) {
	            	flag2=0;
	            	break;
	            }
	            n = n / 2;
	        }
			if(flag2!=0)
				System.out.println("Yes");
			else
				System.out.println("No");

	}
	}

}
