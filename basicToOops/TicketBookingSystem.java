package com.basicToOops;

class TicketBooking {
	int availableseats = 1;

	public synchronized void BookTicket(String user) {
		if (availableseats > 0) {
			System.out.println(user + "is booking ticket...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(user + " successfully booked the ticket");
			availableseats--;
		}else {
			System.out.println(user+ " No tickets are available");
		}
	}
}
class Userr extends Thread{
	TicketBooking booking;
	String userName;
	public Userr(TicketBooking booking,String userName) {
		this.booking = booking;
		this.userName = userName;
	}
	
	public void run() {
		booking.BookTicket(userName);
	}
}

public class TicketBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicketBooking b = new TicketBooking();
		Userr u1 = new Userr(b, "Name1");
		Userr u2 = new Userr(b, "Name2");
		Userr u3 = new Userr(b, "Name3");
		
		u1.start();
		u2.start();
		u3.start();
	}

}





