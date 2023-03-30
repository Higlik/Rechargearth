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

import br.com.rechargearth.model.Company;
import br.com.rechargearth.model.repositories.ICompanyRepository;

@RestController
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private ICompanyRepository companyRepository;
	
	@GetMapping
	public List<Company> listAllCompany()
	{
		return companyRepository.findAll();
	}
	@GetMapping("{id}")
	public Company findById(@PathVariable int id) 
	{
		return companyRepository.findById(id).get();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Company register(@RequestBody Company company) 
	{
		return companyRepository.save(company);
	}
	@PutMapping("{id}")
	public Company update(@RequestBody Company company, @PathVariable int id) 
	{
		company.setId(id);
		return companyRepository.save(company);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id)
	{
		companyRepository.deleteById(id);
	}
		
}
