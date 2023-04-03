package br.com.rechargearth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Seller")
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Seller")
	private int Id;
	private String Name;
	private String CPF;

	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	
}
