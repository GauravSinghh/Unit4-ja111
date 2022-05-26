package com.masai;

import java.util.*;
public class TicketMain {
	public static void main(String[] args) {
		Ticket tkt = new Ticket();
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the ticketid: ");
		int tktID = scan.nextInt();
		tkt.setTicketid(tktID);
		
		System.out.println("Enter the price: ");
		int tktPrice= scan.nextInt();
		tkt.setPrice(tktPrice);
		
		System.out.println("Enter the no of tickets: ");
		int tktNo = scan.nextInt();
		
		
		System.out.println("Available tickets: ");
		int tktAvailable = scan.nextInt();
		tkt.setAvailableTickets(tktAvailable);
		
		System.out.println("Total amount: "+tkt.calculateTicketCost(tktNo));
		System.out.println("Available ticket after booking: "+tkt.getAvailableTickets());

		
		
		
	}
}
