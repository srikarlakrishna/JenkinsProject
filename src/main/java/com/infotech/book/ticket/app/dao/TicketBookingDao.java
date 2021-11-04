package com.infotech.book.ticket.app.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingDao {

	private static Map<Integer, Ticket> map = null;
	static {
		map = new HashMap<>();

		Ticket t1 = new Ticket();
		t1.setTicketId(1);
		t1.setSourceStation("Kavali");
		t1.setDestStation("nellore");
		t1.setEmail("krish@gmail.com");
		t1.setPassengerName("krish");
		t1.setBookingDate(new Date());
		
		Ticket t2 = new Ticket();
		t2.setTicketId(2);
		t2.setSourceStation("nellore");
		t2.setDestStation("chennai");
		t2.setEmail("lalitha@gmail.com");
		t2.setPassengerName("lalitha");
		t2.setBookingDate(new Date());
		
		map.put(t1.getTicketId(), t1);
		map.put(t2.getTicketId(), t2);
	}

	public Ticket save(Ticket ticket) {
		return map.put(ticket.getTicketId(), ticket);
	}

	public Ticket findOne(Integer ticketId) {
		return map.get(ticketId);
	}

	public Map<Integer, Ticket> findAll() {
		return map ;
	}

	public void delete(Integer ticketId) {
		map.remove(ticketId);
	}

}
