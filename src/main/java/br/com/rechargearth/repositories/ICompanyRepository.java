package br.com.rechargearth.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rechargearth.model.Company;

@Repository
public interface ICompanyRepository extends JpaRepository<Company, Integer>{
	List<Company> ListAllCompany();
	void FindCompanyById();
}
