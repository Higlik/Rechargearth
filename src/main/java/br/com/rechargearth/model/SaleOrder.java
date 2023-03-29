package br.com.rechargearth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SaleOrder")
public class SaleOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SaleOrder")
	private int Id;
	
	@OneToMany
	private Battery BatteryId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Battery getBatteryId() {
		return BatteryId;
	}

	public void setBatteryId(Battery batteryId) {
		BatteryId = batteryId;
	}
}
