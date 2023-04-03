package br.com.rechargearth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Battery")
public class Battery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Battery")
	private int Id;
	  enum Type
	  {
		    Car,
		    Motorcycle,
		    PowerBank
	  }
	
	@ManyToOne
	private Seller SellerId;
	@ManyToOne
	private SaleOrder SalerOrderId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	
	
}
