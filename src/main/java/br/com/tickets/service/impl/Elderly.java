package br.com.tickets.service.impl;

import br.com.tickets.service.TicketsInterface;

public class Elderly implements TicketsInterface {

	@Override
	public Double calculateTicketWithDisccount(Double ticketValue) {
		return ticketValue * 0.5;
	}

	@Override
	public String getDisccount(Double ticketValue) {
		Double finalTicket = calculateTicketWithDisccount(ticketValue);
		Double disccount = ticketValue - finalTicket;
		
		return "Your final ticket value is: " + finalTicket + " and you've got a disccount of: " + disccount;
	}

}
