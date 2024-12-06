package in.ashokeit.service;

import java.util.Collection;
import java.util.List;

import in.ashokeit.binding.Passanger;
import in.ashokeit.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passanger p);
	public Collection<Ticket> getAllTickets();
}
