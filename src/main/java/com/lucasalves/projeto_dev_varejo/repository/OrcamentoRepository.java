package com.lucasalves.projeto_dev_varejo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasalves.projeto_dev_varejo.entity.Orcamento;


@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Long>{
    
}
