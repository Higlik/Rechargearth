package br.com.rechargearth.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Sale")
	private int Id;
	private double Value;
	private LocalDate Date;
	
	@ManyToOne
	private Company CompanyId;
	@ManyToOne
	private SaleOrder SaleOrderId;
	@ManyToOne
	private Payment PaymentId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getValue() {
		return Value;
	}
	public void setValue(double value) {
		Value = value;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public Company getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(Company companyId) {
		CompanyId = companyId;
	}
	public SaleOrder getSaleOrderId() {
		return SaleOrderId;
	}
	public void setSaleOrderId(SaleOrder saleOrderId) {
		SaleOrderId = saleOrderId;
	}
	public Payment getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(Payment paymentId) {
		PaymentId = paymentId;
	}
	
		
}
