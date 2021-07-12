import java.util.Scanner;
public class MinimalCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=1,count=0;
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Enter the fees: ");
		int fees = scanner.nextInt();
		if(fees<0) {
			flag=0;
			System.out.println("Invalid input");
		}
		
		if(flag != 0) {
			while(fees >0) {
				if(fees>=500) {
					fees=fees-500;
					count++;
					continue;
					
				}
				else if(fees<500 && fees>=100) {
					fees = fees-100;
				    count++;
				    continue;
				    
				}
				else if(fees<100 && fees>=50) {
					fees = fees-50;
				    count++;
				    continue;
				}
				else if(fees<50 && fees>=10) {
					fees = fees-10;
				    count++;
				    continue; 
				 }
				else if(fees<10 && fees>=5) {
					fees = fees-5;
				    count++;
				    continue;
				}
				else if(fees<5 && fees>=1) {
					fees = fees-1;
				    count++;
				    continue;  
				}
			}
		System.out.println("Total no of coins or notes are: "+count);
		}
			
	}
		
		

}


