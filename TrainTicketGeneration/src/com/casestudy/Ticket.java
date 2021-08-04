package com.casestudy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Date;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ticket {
	private int counter;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	public TreeMap<Passenger,Double> passenger = new TreeMap<>();


	public Ticket(LocalDate travelDate2, Train train) {
		super();
		this.travelDate = travelDate2;
		this.train = train;
	}


	public String generatePNR() throws IOException {
		String pnr = null;
		StringBuilder sb = new StringBuilder();
		sb.append(train.getSource().charAt(0));
		sb.append(train.getDestination().charAt(0));
		sb.append("_");
		sb.append(String.valueOf(travelDate.getYear()));
		DecimalFormat dFormat = new DecimalFormat("00");
		sb.append(dFormat.format(Double.valueOf(travelDate.getMonthValue())));
		sb.append(dFormat.format(Double.valueOf(travelDate.getDayOfMonth())));
		sb.append("_");

		FileInputStream inputStream
		= new FileInputStream("D://CJWorkSpace/TrainTicketGeneration/countTrial.txt");


		DataInputStream dataInputStr
		= new DataInputStream(inputStream);


		while (dataInputStr.available() > 0) {
			int data = dataInputStr.readInt();
			//System.out.println("Reading counter data from file : "+data);
			this.counter=data;
		}  

		sb.append(counter);

		this.pnr = sb.toString();
		return this.pnr;
	}

	public double calcPassengerFare(Passenger passenger) {
		double fare=train.getTicketPrice();
		if(passenger.getAge()<=12) {
			fare = 0.50*train.getTicketPrice();

		}
		else if(passenger.getAge()>=60) {
			fare = 0.60 * train.getTicketPrice();

		}
		else if(passenger.getAge()>12 && passenger.getAge()<60 && passenger.getGender()=='F') {
			fare = 0.75*train.getTicketPrice();	
		}
		else {
			fare = train.getTicketPrice();

		}

		return fare;
	}

	public void addPassenger(String name,int age,char gender) {

		Passenger passengerObj = new Passenger(name,age,gender);

		//System.out.println("Object is created");
		double f = calcPassengerFare(passengerObj);
		
		passenger.put(passengerObj, f);
		//System.out.println("passenger added to tree map");

	}

	public double calculateTotalTicketPrice() {
		double totalFare=0.0;
		for( Map.Entry<Passenger,Double> entry: passenger.entrySet()) {
			totalFare= totalFare+ entry.getValue();
		}
		return totalFare;
	}


	public StringBuilder generateTicket() throws IOException {

		StringBuilder sb = new StringBuilder();
		sb.append("PNR         : " + this.generatePNR()+"\n");
		sb.append("Tain No     : "+this.train.getTrainNo()+"\n");
		sb.append("Train Name  : "+this.train.getTrainName()+"\n");
		sb.append("From        : "+this.train.getSource()+"\n");
		sb.append("To          : "+this.train.getDestination()+"\n");
		String formattedDate = this.travelDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		sb.append("Travel Date : "+formattedDate+"\n\n");
		sb.append("Passengers :\n");
		sb.append("Name\tAge\tGender\tFare\n");

		Set<Passenger> passengerSet = new HashSet<>();
		passengerSet = this.passenger.keySet();
		for(Passenger p :passengerSet) {
			sb.append(p.getName() + "\t" + p.getAge() + "\t" +p.getGender() + "\t" + this.calcPassengerFare(p)+"\n");
		}
		
		/*for(Map.Entry<Passenger, Double> entry : passenger.entrySet()) {
			Passenger p = entry.getKey();			
			sb.append(p.getName() + "\t" + p.getAge() + "\t" +p.getGender() + "\t" + entry.getValue()+"\n");
			System.out.println(p.getName() + "\t" + p.getAge() + "\t" +p.getGender() + "\t" + entry.getValue()+"\n");
		}
*/
		sb.append("Total Price : " + calculateTotalTicketPrice());
		return sb;
	}

	public void writeTicket() throws IOException {

		String name = this.generatePNR();
		FileOutputStream fos = new FileOutputStream(name+".txt");
		String ticket = generateTicket().toString();
		byte[] info = ticket.getBytes();
		fos.write(info);
		fos.close();
		

		FileInputStream inputStream
		= new FileInputStream("D://CJWorkSpace/TrainTicketGeneration/countTrial.txt");


		DataInputStream dataInputStr
		= new DataInputStream(inputStream);

		while (dataInputStr.available() > 0) {
			int data = dataInputStr.readInt();
			// flag=true;
			this.counter=data;
			int  newCounter = 1+ data;
			String strFilePath = "D://CJWorkSpace/TrainTicketGeneration/countTrial.txt";
			FileOutputStream fos2 = new FileOutputStream(strFilePath);
			DataOutputStream dos = new DataOutputStream(fos2);
			int i=newCounter;
			dos.writeInt(i);
			dos.close();	

		}









	}


}
