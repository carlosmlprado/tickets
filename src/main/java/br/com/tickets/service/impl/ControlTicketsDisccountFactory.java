package br.com.tickets.service.impl;

import org.springframework.stereotype.Service;

import br.com.tickets.service.TicketsInterface;

@Service("controlTicketsDisccountFactory")
public class ControlTicketsDisccountFactory {

	public static TicketsInterface getDisccount(String typeOfDisccount) {

		if (typeOfDisccount.equals("student")) {
			return new Students();
			
		} else if (typeOfDisccount.equals("elderly")) {
			return new Elderly();

		} else {
			return null;
		}
	}
}
