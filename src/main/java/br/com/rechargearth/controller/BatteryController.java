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
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.rechargearth.model.Battery;
import br.com.rechargearth.repositories.IBatteryRepository;

public class BatteryController {
	@Autowired
	private IBatteryRepository batteryRepository;
	
	@GetMapping
	public List<Battery> listAllBattery()
	{
		return batteryRepository.findAll();
	}
	@GetMapping("{id}")
	public Battery findByid(@PathVariable int id)
	{
		return batteryRepository.findById(id).get();
	}
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Battery register(@RequestBody Battery battery) 
	{
		return batteryRepository.save(battery);
	}
	@PutMapping("{id}")
	public Battery update(@RequestBody Battery battery, @PathVariable int id) 
	{
		battery.setId(id);
		return batteryRepository.save(battery);
	}
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id)
	{
		batteryRepository.deleteById(id);
	}
	
}
