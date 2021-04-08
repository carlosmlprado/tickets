package br.com.tickets.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.tickets.service.TicketsInterface;
import br.com.tickets.service.impl.ControlTicketsDisccountFactory;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tickets")
public class TicketsRest {

	@GetMapping("/getDisccount/{typeOfDisccount}/{ticketValue}")
	public ResponseEntity<?> getDisccount(@PathVariable(value = "typeOfDisccount") String typeOfDisccount,
			@PathVariable(value = "ticketValue") Double ticketValue) {

		TicketsInterface ticket = ControlTicketsDisccountFactory.getDisccount(typeOfDisccount);

		String resp = ticket.getDisccount(ticketValue);

		if (resp == null) {
			return new ResponseEntity<>(new Gson().toJson("typeOfDisccount doesn't exist."), HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(new Gson().toJson(ticket.getDisccount(ticketValue)), HttpStatus.OK);
		}
	}

}
