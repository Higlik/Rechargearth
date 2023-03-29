package br.com.rechargearth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Payment")
	private int Id;
	private String Type;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	
}
