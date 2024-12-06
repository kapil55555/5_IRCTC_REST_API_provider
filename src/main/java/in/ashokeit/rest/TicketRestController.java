package in.ashokeit.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokeit.binding.Passanger;
import in.ashokeit.binding.Ticket;
import in.ashokeit.service.TicketService;

@RestController  //IRCTC REST API = Producer
public class TicketRestController {

	@Autowired
	private TicketService ticketService;
	
	@PostMapping(value = "/bookticket" ,consumes = "Application/JSON", produces = "Application/JSON")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger ){
		Ticket bookedTicket = ticketService.bookTicket(passanger);
		return new ResponseEntity<Ticket>(bookedTicket,HttpStatus.CREATED);
		
	}
	@GetMapping(value = "/getallticket",produces = "Application/JSON")
	public ResponseEntity<Collection<Ticket>> getAllTickets(){
	    Collection<Ticket> allTickets = ticketService.getAllTickets();
		return new ResponseEntity<Collection<Ticket>>(allTickets,HttpStatus.OK);
		
	}
	
}

































