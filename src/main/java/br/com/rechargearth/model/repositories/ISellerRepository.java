package br.com.rechargearth.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rechargearth.model.Seller;

@Repository
public interface ISellerRepository extends JpaRepository<Seller, Integer> {
	List<Seller> ListAllSeller();
	void FindSellerById();
	
}
