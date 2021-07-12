
public class Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(args[0]);
		int flag =0;
		for(int i=2;i<n;i++) {
		if(n%i == 0) {
			flag= 1;
			break;
		}
		else 
			flag= 0;
		}
		if(flag==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");

	}

}
