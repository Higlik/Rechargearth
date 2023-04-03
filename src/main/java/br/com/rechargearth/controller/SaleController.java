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

import br.com.rechargearth.model.Sale;
import br.com.rechargearth.repositories.ISaleRepository;

@RestController
@RequestMapping("sale")
public class SaleController {
	
	@Autowired
	private ISaleRepository saleRepository;
	
	@GetMapping
	public List<Sale> listAllSale()
	{
		return saleRepository.findAll();
	}
	@GetMapping("{id}")
	public Sale findById(@PathVariable int id) 
	{
		return saleRepository.findById(id).get();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Sale register(@RequestBody Sale sale) 
	{
		return saleRepository.save(sale);
	}
	@PutMapping("{id}")
	public Sale update(@RequestBody Sale sale, @PathVariable int id) 
	{
		sale.setId(id);
		return saleRepository.save(sale);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id)
	{
		saleRepository.deleteById(id);
	}

}
