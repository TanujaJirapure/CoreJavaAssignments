package com.casestudy;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException, IOException {
		
		Scanner sc = new Scanner(System.in);
	
		TrainDAO daoObj = new TrainDAO();
		
		System.out.println("Enter the train number");
		int trainNo = sc.nextInt();  
		
		if(daoObj.findTrain(trainNo)!=null) {
			System.out.println("Train data exist");
			System.out.println("enter travel date in dd/mm/yyyy format");
			
			String date = sc.next();
		    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    LocalDate travelDate = LocalDate.parse(date, dateFormat);
			
			LocalDate currentDate = LocalDate.now();
	
			//System.out.println(travelDate);
			if(travelDate.compareTo(currentDate)>0) {
				
				System.out.println("Enter number of passengers");
				int num = sc.nextInt();
					
				Ticket ticket = new Ticket (travelDate,daoObj.findTrain(trainNo));
				
				for(int i=0;i<num;i++) {
					
					System.out.println("Enter Passenger Name");
					String name = sc.next();
					System.out.println("Enter Passenger Age");
					int age = sc.nextInt();
					System.out.println("Enter Gender(M/F)");
					String gender = sc.next();
					char g = gender.charAt(0);
					ticket.addPassenger(name,age,g);
					
					
				}
				
				//System.out.println("Printing the String buffer\n"+ticket.generateTicket());
			
				
				System.out.println("Ticket Booked with PNR : "+ticket.generatePNR());
				ticket.writeTicket();
				
			}
			else {
				System.out.println("Travel date is before current date");
			}

		}
	}

}
