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

import br.com.rechargearth.model.SaleOrder;
import br.com.rechargearth.repositories.ISaleOrderRepository;

@RestController
@RequestMapping("sale-order")
public class SaleOrderController {

	@Autowired
	private ISaleOrderRepository saleOrderRepository;
	
	@GetMapping
	public List<SaleOrder> listAllSaleOrder()
	{
		return saleOrderRepository.findAll();
	}
	@GetMapping("{id}")
	public SaleOrder findById(@PathVariable int id) 
	{
		return saleOrderRepository.findById(id).get();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public SaleOrder register(@RequestBody SaleOrder saleOrder) 
	{
		return saleOrderRepository.save(saleOrder);
	}
	@PutMapping("{id}")
	public SaleOrder update(@RequestBody SaleOrder saleOrder, @PathVariable int id) 
	{
		saleOrder.setId(id);
		return saleOrderRepository.save(saleOrder);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id)
	{
		saleOrderRepository.deleteById(id);
	}
}
