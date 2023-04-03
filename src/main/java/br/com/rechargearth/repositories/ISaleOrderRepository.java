package br.com.rechargearth.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rechargearth.model.SaleOrder;

@Repository
public interface ISaleOrderRepository extends JpaRepository<SaleOrder, Integer>{
	List<SaleOrder> ListAllSaleOrder();
	void FindSaleOrderById();
}
