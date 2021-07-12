
public class que6 {

	public static void main(String[] args) {
		System.out.println("First 10 numbers of Fibbonachi Series: ");
		int n1,n2,n3;
		n1 = 0;
		n2 = 1;
		System.out.print(n1 + " "+n2 + " ");
		for(int i=0;i<8;i++) {
			n3=n1+n2;
			n1=n2;;
			n2=n3;
			System.out.print(n3 + " ");
		}
		System.out.println();
		System.out.println("Odd numbers less than 100:");
		int a1=0;
		int a3,a2=1;
		
		do {
			a3=a1+a2;
			a1=a2;
			a2=a3;
			if(a3%2 != 0) {
				System.out.print(a3 +" ");
			}
		}while(a3<100);
		
		System.out.println();
		System.out.println("Even numbers between 100 and 1000:");
		a1=0;a2=1;a3=0;
		while(a3<1000) {
			a3=a1+a2;
			a1=a2;a2=a3;
			if(a3%2==0 && a3>100)
				System.out.print(a3+" ");
		}
		int sum=0,b1=0,b2=1,b3=0;
		System.out.println();
		sum=b1+b2;
		System.out.println("Sum of nos less than 100");
		do {
			sum=sum+b3;
			b3=b1+b2;
			b1=b2;
			b2=b3;
			
			
		
			
		}while(b3<100);
		System.out.print(sum);
		

	}

}
