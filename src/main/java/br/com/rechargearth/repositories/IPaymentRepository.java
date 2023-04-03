package br.com.rechargearth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rechargearth.model.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Integer>{

}
