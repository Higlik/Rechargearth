package br.com.rechargearth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rechargearth.model.Payment;
import br.com.rechargearth.repositories.IPaymentRepository;

@RestController
@RequestMapping("payment")
public class PaymentController {
	@Autowired
	private IPaymentRepository paymentRepository;
	
	@GetMapping
	public List<Payment> listAllPayment()
	{
		return paymentRepository.findAll();
	}
	@GetMapping("{id}")
	public Payment findById(@PathVariable int id) 
	{
		return paymentRepository.findById(id).get();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Payment register(@RequestBody Payment payment) 
	{
		return paymentRepository.save(payment);
	}
	@PutMapping("{id}")
	public Payment update(@RequestBody Payment payment, @PathVariable int id) 
	{
		payment.setId(id);
		return paymentRepository.save(payment);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id)
	{
		paymentRepository.deleteById(id);
	}
}
