package br.com.tickets.service;

public interface TicketsInterface {

	Double calculateTicketWithDisccount(Double ticketValue);

	String getDisccount(Double ticketValue);
}
