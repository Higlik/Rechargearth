package br.com.rechargearth.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rechargearth.model.Sale;

@Repository
public interface ISaleRepository extends JpaRepository<Sale, Integer>{
	List<Sale> ListAllSale();
	void FindSaleById();
	
}
