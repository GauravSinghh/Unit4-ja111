package com.masai;

public class Ticket {

	private int ticketid; 
	private int price; 
	private static int availableTickets; 
	
	
	public int calculateTicketCost(int nooftickets) {
		int ticketsLeft=getAvailableTickets();
		if(ticketsLeft>0)
		{
			int x =ticketsLeft-nooftickets;
			setAvailableTickets(x);
			int y= getPrice();
			int totalAmount = nooftickets*y;
			return totalAmount;
		}else
		{
			return -1;
		}
	}
	
	public int getTicketid() {
		return ticketid;
	}
	
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		{
			Ticket.availableTickets = availableTickets;
		}else
		{
			System.out.println("Tickets are not available,make it available");
		}
	}
	
	public Ticket() {
		
	}

}
