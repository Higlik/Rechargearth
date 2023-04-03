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

import br.com.rechargearth.model.Seller;
import br.com.rechargearth.repositories.ISellerRepository;

@RestController
@RequestMapping("seller")
public class SellerController {
	@Autowired
	private ISellerRepository sellerRepository;
	
	@GetMapping
	public List<Seller> listAllSeller()
	{
		return sellerRepository.findAll();
	}
	@GetMapping("{id}")
	public Seller findByid(@PathVariable int id)
	{
		return sellerRepository.findById(id).get();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Seller register(@RequestBody Seller seller) 
	{
		return sellerRepository.save(seller);
	}
	@PutMapping("{id}")
	public Seller update(@RequestBody Seller seller, @PathVariable int id) 
	{
		seller.setId(id);
		return sellerRepository.save(seller);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id)
	{
		sellerRepository.deleteById(id);
	}
	
}
