package com.example.springmysqlapidao;

import org.springframework.data.repository.CrudRepository;

import com.example.springmysqlapimodel.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{	
}
