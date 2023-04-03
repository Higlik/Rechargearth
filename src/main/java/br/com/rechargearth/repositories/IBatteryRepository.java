package br.com.rechargearth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rechargearth.model.Battery;

public interface IBatteryRepository extends JpaRepository<Battery, Integer>{
	
}
