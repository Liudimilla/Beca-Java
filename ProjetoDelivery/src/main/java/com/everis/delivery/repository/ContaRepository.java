package com.everis.delivery.repository;

import com.everis.delivery.model.Conta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
@NoRepositoryBean
public interface ContaRepository extends CrudRepository<Conta, Integer> {

    public Conta findbyId(Integer id);
}
