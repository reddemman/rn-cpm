package com.polestar.model;
/**
 * Model class to store ticket information
 * @author reddemma
 *
 */
public class Ticket {
	// Stores ticket id 
	private int ticketId = 0;
	private static int id = 5000;

	public Ticket() {
		ticketId = id++;

	}
	//Method to get the ticket id
	public int getTicketId() {
		return ticketId;
	}
}
