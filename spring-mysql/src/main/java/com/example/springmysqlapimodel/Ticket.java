package com.example.springmysqlapimodel;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String category;
	
}
